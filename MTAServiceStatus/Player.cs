using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MTAServiceStatus
{
    public class Player
    {
        public Location Location { get; set; }

        public void Reserve(Court court)
        {
            court.IsReserved = true;
        }

        public Court FindNearCourt(List<Court> courts)
        {
            Location = new Location(1);

            return courts
                .Select(q => new
                {
                    Court = q,
                    Distance = q.Location.CalDistance(Location)
                })
                .OrderBy(q => q.Distance)
                .Select(q => q.Court)
                .FirstOrDefault();
        }
    }
}