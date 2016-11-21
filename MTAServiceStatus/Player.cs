using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MTAServiceStatus
{
    public class Player
    {
        public void Reserve(Court court)
        {
            court.IsReserved = true;
        }
    }
}
