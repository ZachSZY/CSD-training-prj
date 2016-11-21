namespace MTAServiceStatus
{
    public class CorePlayer: Player
    {
        public Reservation Reserve(Court court, int startTime, int endTime,CycleEnum cycleEnum)
        {
            var reservation = base.Reserve(court, startTime, endTime);
            reservation.CycleEnum = cycleEnum;

            return reservation;
        }
    }

    public enum CycleEnum
    {
        Everyday,
    }
}