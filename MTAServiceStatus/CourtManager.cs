using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MTAServiceStatus
{
    public class CourtManager
    {
        public void Publish(Court court)
        {
            court.IsPublished = true; 
        }
    }
}
