﻿using System;

namespace MTAServiceStatus
{
    public class Court
    {
        public Court() { }

        public bool IsPublished { get; set; }

        public bool IsReserved { get; set; }

        public Location Location { get; private set; }
    }
}