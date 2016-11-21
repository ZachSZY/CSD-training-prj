using System;
using MTAServiceStatus;
using NUnit.Framework;

namespace Tests
{
    [TestFixture]
    public class CorePlayerTest
    {
        [Test]
        public void When_coreplay_create_Then_create_instance()
        {
            CorePlayer corePlayer = new  CorePlayer();

            Assert.IsInstanceOf<CorePlayer>(corePlayer);
        }

        [Test]
        public void Given_coreplayer_Then_create_reserve_Then_reserve()
        {
            CorePlayer corePlayer = new CorePlayer();
            Court court = new Court();
            int startTime = 1;
            int endTime = 2;
            CycleEnum cycle = CycleEnum.Everyday;

            Reservation reservation = corePlayer.Reserve(court, startTime, endTime, cycle);

            Assert.AreEqual(cycle, reservation.CycleEnum);
        }
    }


}