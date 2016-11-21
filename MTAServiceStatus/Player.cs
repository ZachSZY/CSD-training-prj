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
            var players = new List<Player>();
            players.Add(this);
            return new Reservation()
            {
                Court = court,
                CycleEnum = CycleEnum.Singleday,
                StartTime = startTime,
                EndTime = endTime,
                Players = players
            };
        }

        public void ShareReservation(Player[] players, Reservation reserv)
        {
            reserv.Players.AddRange(players);
        }
    }
}