using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;
using System.Data;
using System.IO;
using System.Linq;
using LinqToExcel;

namespace cheocell_gui
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

        }

        private void bW_TextChanged(object sender, EventArgs e)
        {

        }

        private void nhapCell_Click(object sender, EventArgs e)
        {

            OpenFileDialog of = new OpenFileDialog();
            of.ShowDialog();
            if (of.FileName != "")
            {
                string file = of.FileName;
                linkCell.Text = file;
                string ext = Path.GetExtension(file);
                if (ext.ToLower() == ".xlsx" || ext.ToLower().Equals(".xls"))
                {

                    MessageBox.Show("mở được file");

                }

                else
                    MessageBox.Show("không mở được file");


            }
            else
                MessageBox.Show("bạn chưa nhập gì ");

        }





        private void nhapScan_Click(object sender, EventArgs e)
        {

            OpenFileDialog of = new OpenFileDialog();
            of.ShowDialog();
            if (of.FileName != "")
            {
                string file = of.FileName;
                linkScan.Text = file;
                string ext = Path.GetExtension(file);
                if (ext.ToLower() == ".xlsx" || ext.ToLower().Equals(".xls"))
                {
                    MessageBox.Show("file scan chuẩn");
                }
                else
                    MessageBox.Show("không mở được file");


            }

            else
                MessageBox.Show("bạn chưa nhập gì ");

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void KhoangCach_TextChanged(object sender, EventArgs e)
        {

        }

        private void diemPhucVu_TextChanged(object sender, EventArgs e)
        {

        }



        //hàm này đổi độ sang raddia
        static double toRadians(
             double angleIn10thofaDegree)
        {
            // Angle in 10th 
            // of a degree 
            return (angleIn10thofaDegree *
                           Math.PI) / 180;
        }







        //hàm này tính khoảng cách giữa 2 điểm khi biết tọa độ
        static double distance(double lat1,
                               double lat2,
                               double lon1,
                               double lon2)
        {

            // The math module contains  
            // a function named toRadians  
            // which converts from degrees  
            // to radians. 
            lon1 = toRadians(lon1);
            lon2 = toRadians(lon2);
            lat1 = toRadians(lat1);
            lat2 = toRadians(lat2);

            // Haversine formula  
            double dlon = lon2 - lon1;
            double dlat = lat2 - lat1;
            double a = Math.Pow(Math.Sin(dlat / 2), 2) +
                       Math.Cos(lat1) * Math.Cos(lat2) *
                       Math.Pow(Math.Sin(dlon / 2), 2);

            double c = 2 * Math.Asin(Math.Sqrt(a));

            // Radius of earth in  
            // kilometers. Use 3956  
            // for miles 
            double r = 6371;
            //double r = 6400;
            // calculate the result 
            return (c * r);
        }







        //hàm này dùng để tìm xem một điểm có góc hướng là x có thuộc dải góc hướng phục vụ của cell là a -30 đến a+30 không. nđú có trả về true còn không trả về false
        static bool doTim(double a, double x, double bw)
        {
            bool ketqua = false;
            // double bw = 50;      //nhap bup song   a la goc azimut   b la azimut cua diem      

            if ((a >= bw) && (a < 360 - bw))
            {
                if ((x > (a - bw)) && (x < (a + bw)))
                    ketqua = true;
            }
            if ((a >= 360 - bw) && (a < 360))
            {
                if (((x >= a - bw) && (x < 360)) || ((x >= 0) && (x < a + bw - 360)))
                    ketqua = true;
            }
            if ((a >= 0) && (a < bw))
                if (((x >= 360 + a - bw) && (x < 360)) || ((x > 0) && (x < a + bw)))
                    ketqua = true;


            return ketqua;
        }







        //hàm này tính góc hướng của điểm đến một cell: áp dụng công thức toán học lượng giác cos A = (B2+C2-A2)/2bc
        static double angle(double lat1,
                               double lat2,
                               double lon1,
                               double lon2)
        {
            DIEM a = new DIEM(90, 0, 23, 32);
            double canhke1 = distance(a.lat, lat1, a.lon, lon1);
            //   Console.WriteLine("do dai canh ke 1 là: " + canhke1);

            double canhdoi = distance(a.lat, lat2, a.lon, lon2);
            //  Console.WriteLine("do dai canh doi là: " + canhdoi);

            double canh2diem = distance(lat1, lat2, lon1, lon2);
            //  Console.WriteLine("do dai canh2diem là: " + canh2diem);

            double cosgoc = (Math.Pow(canhke1, 2) + Math.Pow(canh2diem, 2) - Math.Pow(canhdoi, 2)) / (2 * canhke1 * canh2diem);
            //Console.WriteLine("góc 2 điểm chưa doi là: " + cosgoc);
            double cos = (Math.Acos(cosgoc) * 180) / Math.PI;

            //Console.WriteLine("góc 2 dddd điểm chưa doi là: " + cos);
            if (lon1 < lon2)
                return cos;
            else
                return (360 - cos);

        }







        //hàm mở file excell scan và add các trường thông tin của file excel vào một list điểm trong class cell
        static CELL OPenDIEM(string a)
        {
            CELL cell = new CELL();
            // DIEM diem2 = new DIEM();
            string file1 = a;
            string ext1 = Path.GetExtension(file1).ToString();
            if (ext1 == ".xlsx")
            {
                var excel = new ExcelQueryFactory(file1);
                var cellfile1 = from truongCellFile in excel.Worksheet<DIEM>("Sheet1")
                                select truongCellFile;


                foreach (var item in cellfile1)
                {
                    DIEM diem1 = new DIEM(item.lat, item.lon, item.uarfcn, item.psc);
                    cell.DiemList.Add(diem1);
                    // diem1.diemList.Add(diem1);
                    //  Console.WriteLine("các diem cần in là: " + item.anlge);
                }


            }
            else
                MessageBox.Show("đang bị lỗi không mở được file scan");
            return cell;

        }






        //hàm này mở file cell

        static TRAM OPenCELL(string a)
        {
            TRAM tram = new TRAM();
            string file = a;
            string ext = Path.GetExtension(file).ToString();
            if (ext == ".xlsx")
            {
                var excel = new ExcelQueryFactory(file);
                var cellfile = from truongCellFile in excel.Worksheet<CELL>("Sheet1")
                               select truongCellFile;


                foreach (var item in cellfile)
                {
                    // string nameTram = item.tramName;


                    CELL cell1 = new CELL(item.tramName, item.tencell, item.lonCell, item.latCell, item.Azimut, item.uarfcn, item.psc);
                    tram.CellList.Add(cell1);
                    // Console.WriteLine("các trường cần in là: "+ item.tencell.ToString());
                }


            }
            else
                MessageBox.Show("đang bị lỗi không mở được file  cell");
            return tram;

        }






        TRAM tram2 = new TRAM();

        private void timCheoCell_Click(object sender, EventArgs e)
        {

            List<TRAM> tramList = new List<TRAM>();
            TRAM tram = new TRAM();
            CELL cell = new CELL();
            //  tram = OPenCELL(linkScan.Text.ToString());
            //   cell = OPenDIEM(linkCell.Text.ToString());
            tram = OPenCELL(linkCell.Text.ToString());
            cell = OPenDIEM(linkScan.Text.ToString());
            //  double d = double.Parse(KhoangCach.Text);


            double d = double.Parse(KhoangCach.Text); 
           // double d;
           //if( !double.TryParse(KhoangCach.Text, out d))
           // { MessageBox.Show("nhập lại khoảng cách"); }
        


                double bw = double.Parse(bW.Text);

            //    double bw;

            //if (!double.TryParse(KhoangCach.Text, out bw))
            //{ MessageBox.Show("nhập lại búp  sóng"); }

            double diempv = double.Parse(diemPhucVu.Text);
            //double diempv;
            //if (!double.TryParse(KhoangCach.Text, out diempv))
            //{ MessageBox.Show("nhập lại điểm phục vụ"); }


            foreach (CELL itemCell in tram.CellList)//đây là xét đến các cell trong danh sách cell
            {
                foreach (DIEM itemDiem in cell.DiemList)// xét đến các điểm trong danh sách điểm
                {
                    // câu này là tìm xem điểm nào có cùng psc và cùng uarfcn và cách trạm không quá 5km thì cho điểm đó vào danh sách các điểm cell đang phục vụ.
                    if ((itemCell.psc == itemDiem.psc) && (itemCell.uarfcn == itemDiem.uarfcn) && (distance(itemCell.latCell, itemDiem.lat, itemCell.lonCell, itemDiem.lon) < d))
                    {
                        itemCell.DiemList.Add(itemDiem);//dòng add điểm vào trong danh sách điểm của cell
                    }
                    else
                        continue;
                }
            }


            TRAM tram2 = new TRAM();


            //     tìm những trạm nào có điểm phục vụ thì thêm vào trạm 2, đồng thời tính góc của điểm đó với trạm xem là bao nhiêu độ luôn.
            foreach (CELL itemCell in tram.CellList)
            {
                if (itemCell.DiemList.Count > diempv)
                {
                    foreach (DIEM itemDiem in itemCell.DiemList)
                    {

                        itemDiem.anlge = angle(itemCell.latCell, itemDiem.lat, itemCell.lonCell, itemDiem.lon); //tính góc hướng của điểm với cell phục vụ

                    }
                    tram2.CellList.Add(itemCell);// nếu cell đó có trên 1 điểm phục vụ thì add cell đó vào tập trạm2
                }
                else
                    continue;

            }





            //phần này xác định cell nào bị chéo nếu cell chéo thì swap = true


            //xác định bằng cách nếu số điểm phục vụ của cell trên lớn hơn 60% tổng số điểm có góc hướng không thuộc góc hướng của cell ( góc hướng của cell +- 30 độ) thì là chéo rồi

           

            foreach (CELL itemcell in tram2.CellList)
            {
                double anlgeTBtem = 0;// tính góc hướng trung bình  của các điểm thuộc cell đó

                foreach (DIEM itemDiem in itemcell.DiemList)
                {


                    if (!doTim(itemcell.Azimut, itemDiem.anlge, bw))//hàm này để dò xem điểm có thuộc góc hướng của cell ko

                    { itemcell.demdiem++; }// biến đếm  đếm xem có bao nhiêu điểm không thuộc góc hướng của cell

                    anlgeTBtem = anlgeTBtem + itemDiem.anlge;
                }

                if (((double)itemcell.demdiem / (double)itemcell.DiemList.Count) > 0.6)//lớp hơn 60% thì tức là cell này phải swap lại
                { itemcell.swap = true; }

                itemcell.angleTB = (anlgeTBtem / itemcell.DiemList.Count); //tính góc hướng trung bình của cell

                //  if (itemcell.swap == true)
                //  ketqua.Rows.Add(itemcell.tramName, itemcell.tencell, itemcell.latCell, itemcell.lonCell, itemcell.uarfcn, itemcell.psc, itemcell.Azimut, itemcell.angleTB);
                //  Console.WriteLine(itemcell.tramName + ";" + itemcell.tencell + ";" + itemcell.latCell + ";" + itemcell.lonCell + ";" + itemcell.uarfcn + ";" + itemcell.psc + ";" + itemcell.Azimut + ";" + itemcell.angleTB);
            }


            DataTable ketqua = new DataTable();
            ketqua.Columns.Add("TramName");
            ketqua.Columns.Add("tencell");
            ketqua.Columns.Add("latCell");
            ketqua.Columns.Add("lonCell");
            ketqua.Columns.Add("uarfcn ");
            ketqua.Columns.Add("psc");
            ketqua.Columns.Add("Azimut");
            ketqua.Columns.Add("AngleTB");
            ketqua.Columns.Add("so_mau");


            foreach (CELL item in tram2.CellList)
            {
                if (item.swap == true)
                    ketqua.Rows.Add(item.tramName, item.tencell, item.latCell, item.lonCell, item.uarfcn, item.psc, item.Azimut, item.angleTB, item.DiemList.Count);

            }
            ketqua.AcceptChanges();
            dataGridView1.DataSource = ketqua;






            String filepath = linkResult.Text+"\\test.txt";
            //    FileStream fs = new FileStream(filepath, FileMode.Create);
            try
            {
                using (StreamWriter sw = new StreamWriter(filepath))
                {
                    sw.WriteLine("tên trạm;" + "tên cell;" + "lat cell;"+ "lonCell;" + "uarfcn;" + "psc;" + "Azimut;"+ "angleTB;" + "số mẫu;"+ "swap");

                    foreach (CELL itemcell in tram2.CellList)
                    {
                       // if (itemcell.swap == true)
                            sw.WriteLine(itemcell.tramName + ";" + itemcell.tencell + ";" + itemcell.latCell + ";" + itemcell.lonCell + ";" + itemcell.uarfcn + ";" + itemcell.psc + ";" + itemcell.Azimut + ";" + itemcell.angleTB + ";" + itemcell.DiemList.Count+ ";"+ itemcell.swap );
                    }
                    MessageBox.Show("file chéo cheo đã được tạo ra ở thư mục " + filepath);
                }
            }
            catch (Exception g)

            {
                MessageBox.Show("Error:  đường dẫm của bạn ko đúng hoặc đường dẫn vào thư mục windows ko cho phép chương trình tạo file"+ g);
            }

        }

       

        private void linkResult_TextChanged(object sender, EventArgs e)
        {

        }

        private void linkScan_TextChanged(object sender, EventArgs e)
        {

        }

        private void linkCell_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }
    }
}
