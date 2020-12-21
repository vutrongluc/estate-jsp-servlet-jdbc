using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cheocell_gui
{
    class TRAM
    {
        public List<CELL> CellList = new List<CELL>();
        public CELL Cell { get; set; }
        public TRAM(CELL a)
        {
            this.Cell = a;
            CellList.Add(a);
        }
        public TRAM()
        { }

    }
}
