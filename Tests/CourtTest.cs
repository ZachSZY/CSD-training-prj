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

    }
}
