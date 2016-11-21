using MTAServiceStatus;
using NUnit.Framework;

namespace Tests
{
    [TestFixture]
    public class LocationTest
    {
        [Test]
        public void Give_location_When_cal_with_other_location_Then_return_distance()
        {
            Location location = new Location(1);

            var distant = location.CalDistance(new Location(2));

            Assert.AreEqual(1,distant);
        }
    }
}