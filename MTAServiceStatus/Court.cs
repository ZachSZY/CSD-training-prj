namespace MTAServiceStatus
{
    public class Court
    {
        public Court() { }

        public int CourtID { get; set; }

        public decimal FeePerHour { get; set; }

        public bool IsPublished { get; set; }

        public bool IsReserved { get; set; }

        public Location Location { get; set; }
    }
}