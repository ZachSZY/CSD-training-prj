using System;

namespace MTAServiceStatus
{
    public class Location
    {
        public Location(int distance)
        {
            Distance = distance;
        }

        public int Distance { get;private set; }

        public int CalDistance(Location location)
        {
            return Math.Abs( Distance - location.Distance);
        }
    }
}