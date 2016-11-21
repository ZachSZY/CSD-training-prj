using System.Security.Cryptography.X509Certificates;
using MTAServiceStatus;
using NUnit.Framework;

namespace Tests
{
    [TestFixture]
    public class ReservationTest
    {
        [Test]
        public void Given_reservation_when_cal_Then_return_fee()
        {
            Reservation reservation = new Reservation()
            {
                Court = new Court()
                {
                    FeePerHour = 5,
                },
                StartTime = 1,
                EndTime = 2,
            };

           decimal fee= reservation.CalFee();

            Assert.AreEqual(5,fee);
        }
    }
}