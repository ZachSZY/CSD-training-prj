package com.tennis;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

import static org.junit.Assert.*;

public class CourtRepoTest {
    @Test
    public void Given_an_unreserved_court_and_period_When_check_whether_reserved_Then_return_unreserved() throws Exception {
        Court court = new Court();
        Date start = new Date();
        Date end = new Date();
        com.tennis.Period duration = com.tennis.Period.between(start, end);

        CourtRepo repo = new CourtRepo();
        boolean isReserved = repo.isReserved(court, duration);

        assertFalse(isReserved);
    }

//    @Test
//    public void GIVEN_an_reserved_court_and_period_WHEN_check_whether_reserved_THEN_return_reserved(){
//        Court court = new Court();
//        Date start = new Date();
//        Date end = new Date();
//        com.tennis.Period duration = com.tennis.Period.between(start, end);
//        (new Player()).reserve(court, duration);
//
//        CourtRepo repo = new CourtRepo();
//        boolean isReserved = repo.isReserved(court, duration);
//
//        assertTrue(isReserved);
//
//
//    }
}