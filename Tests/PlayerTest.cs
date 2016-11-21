using System.Linq.Expressions;
using MTAServiceStatus;
using NUnit.Framework;

namespace Tests
{
    [TestFixture]
    public class PlayerTest
    {
        [Test]
        public void Given_a_player_Then_reserve_court_Then_court_is_reserved()
        {
            Player play = new Player();
            var court = new Court();
            play.Reserve(court);

            Assert.AreEqual(true,court.IsReserved);
        }
    }
}