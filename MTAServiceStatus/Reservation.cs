using System.Collections.Generic;

namespace MTAServiceStatus
{
    public class Reservation
    {
        public int ID { get; set; }

        public Court Court { get; set; }

        public List<Player> Players { get; set; }

        public int StartTime { get; set; }

        public int EndTime { get; set; }

        public CycleEnum CycleEnum { get; set; }

        public decimal CalFee()
        {
            return Court.FeePerHour * (EndTime- StartTime);
        }
    }
}