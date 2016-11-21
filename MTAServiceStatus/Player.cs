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

        public Court FindNearCourt(List<Court> courts)
        {
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

        public Reservation Reserve(Court court, int startTime, int endTime)
        {
            court.IsReserved = true;

            return new Reservation()
            {
                Court = court,
                StartTime = startTime,
                EndTime = endTime,
            };
        }
    }
}