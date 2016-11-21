using NUnit.Framework;
using MTAServiceStatus;
using System.Collections;
using System.Collections.Generic;

namespace Tests
{
    [TestFixture]
    public class CourtManagerTest
    {
        CourtManager _courtManager;
        Court _court;

        [SetUp]
        public void CreateCourtManager()
        {
            _courtManager = new CourtManager();
            _court = new Court();
        }

        [Test]
        public void Given_CourtManager_When_Pub_Court_Then_Court_Status_Published()
        {
            _courtManager.Publish(_court);
            Assert.AreEqual(true, _court.IsPublished);
        }

        [Test]
        public void Given_CourtManager_When_Pub_Courts_Show_Court_List()
        {
            var courtList = _courtManager.ListCourt();
            Assert.IsTrue(courtList.Count > 0);
        }
    }
}
