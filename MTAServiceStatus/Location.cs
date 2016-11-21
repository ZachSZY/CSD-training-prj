namespace MTAServiceStatus
{
    public class Location
    {
        private int Distance { get; set; }

        public int CalDistance(Location location)
        {
            return Distance - location.Distance;
        }
    }
}