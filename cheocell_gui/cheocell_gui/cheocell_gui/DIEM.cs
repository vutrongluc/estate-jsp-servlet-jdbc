using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LinqToExcel.Attributes;



namespace cheocell_gui
{
    class DIEM
    {



        [ExcelColumn("Longitude")]
        public double lon { get; set; }


        [ExcelColumn("Latitude")]
        public double lat { get; set; }


        [ExcelColumn("Anlge")]
        public double anlge { get; set; }


        [ExcelColumn("UARFCN")]
        public double uarfcn { get; set; }


        [ExcelColumn("PSC")]
        public double psc { get; set; }

        public DIEM()
        { }
        public DIEM(double a, double b, double uarfcn, double psc)
        {

            this.lat = a;
            this.lon = b;
            this.uarfcn = uarfcn;
            this.psc = psc;
            this.anlge = 0;
        }

    }
}
