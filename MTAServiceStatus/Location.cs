using System;

namespace MTAServiceStatus
{
    public class Location
    {
        public Location(int distance)
        {
            Distance = distance;
        }

        private int Distance { get; set; }

        public int CalDistance(Location location)
        {
            return Math.Abs( Distance - location.Distance);
        }
    }
}