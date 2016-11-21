using NUnit.Framework;

using MTAServiceStatus;

namespace Tests
{
    [TestFixture]
    public class CourtTest
    {
        Court _court;

        [SetUp]
        public void CreateCourt()
        {
            _court = new Court();
        }

        [Test]
        public void When_Create_Court_Then_Return_CourtInstance()
        {
            Assert.IsInstanceOf<Court>(new Court());
        }

        [Test]
        public void Given_a_Court_When_Publish_Then_Status_Published_is_True()
        {
            _court.Publish();
            Assert.AreEqual(true, _court.IsPublished);
        }

        [Test]
        public void Given_a_Court_When_Reserve_THen_resverd_status_is_true()
        {
            _court.Reserve();

            Assert.AreEqual(true,_court.IsReserved);
        }
    }
}
