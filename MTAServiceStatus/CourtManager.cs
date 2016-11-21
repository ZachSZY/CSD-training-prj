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

        public List<Court> ListCourt()
        {
            var list = new List<Court>();
            list.Add(new Court { IsPublished = true });
            return list;
        }
    }
}
