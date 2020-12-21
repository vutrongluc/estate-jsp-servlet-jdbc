using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LinqToExcel.Attributes;

namespace cheocell_gui
{
    class CELL
    {
        public List<DIEM> DiemList = new List<DIEM>();

        public DIEM Diem { get; set; }


        [ExcelColumn("NODEBNAME")]
        public string tramName { get; set; }


        [ExcelColumn("CELLNAME")]
        public string tencell { get; set; }


        [ExcelColumn("Long")]
        public double lonCell { get; set; }


        [ExcelColumn("Lat")]
        public double latCell { get; set; }


        [ExcelColumn("Azimuth")]
        public double Azimut { get; set; }


        [ExcelColumn("UARFCNDOWNLINK")]
        public double uarfcn { get; set; }


        [ExcelColumn("PSCRAMBCODE")]
        public double psc { get; set; }

        public int demdiem { get; set; }
        public bool swap { get; set; }

        public double angleTB { get; set; }
        public CELL()
        { }
        public CELL(string tramName, string TenCell, double loncell, double latcell, double azimut, double uarfcn, double psc)
        {
            this.tramName = tramName;
            this.tencell = TenCell;
            // this.Diem = a;
            this.lonCell = loncell;
            this.latCell = latcell;
            this.Azimut = azimut;
            this.uarfcn = uarfcn;
            this.psc = psc;
            this.swap = false;
            this.demdiem = 0;
            this.angleTB = 0;
            // DiemList.Add(this.Diem);
        }
    }
}
