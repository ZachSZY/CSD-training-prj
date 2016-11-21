using System.Collections.Generic;
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

        [Test]
        public void Given_play_Then_find_near_location_Then_return_location_list()
        {
            Player player = new Player();
            List<Court> courts = new List<Court>()
            {
                new Court(){Location = new Location(1)},
                new Court(){Location = new Location(2)},
                new Court(){Location = new Location(3)}
            };

            Court court =  player.FindNearCourt(courts);

            Assert.IsNotNull(court);
        }
    }
}