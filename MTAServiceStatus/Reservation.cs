namespace MTAServiceStatus
{
    public class Reservation
    {
        public int ID { get; set; }

        public Court Court { get; set; }

        public int StartTime { get; set; }

        public int EndTime { get; set; }

        public CycleEnum CycleEnum { get; set; }
    }
}