﻿using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

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
    }
}
