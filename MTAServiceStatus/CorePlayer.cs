namespace MTAServiceStatus
{
    public class CorePlayer: Player
    {
        public Reservation Reserve(Court court, int startTime, int endTime,CycleEnum cycleEnum)
        {
            court.IsReserved = true;

            return new Reservation()
            {
                Court = court,
                StartTime = startTime,
                EndTime = endTime,
                CycleEnum = cycleEnum
            };
        }
    }

    public enum CycleEnum
    {
        Everyday,
    }
}