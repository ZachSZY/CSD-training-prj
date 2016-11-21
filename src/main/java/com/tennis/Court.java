package com.tennis;

import java.time.Duration;

/**
 * Created by jiah on 2016/11/21.
 */
public class Court {
    private ReservationRepo reservationRepo = new ReservationRepo();

    public void release(Period time) {
        CourtRepo repo = new CourtRepo();
        repo.release(this, time);
    }

    public boolean isReserved(Period time) {
        return false;
    }

    public void reserve(Period duration) {
        CourtRepo repo = new CourtRepo();
        repo.reserve(this, duration);
    }
}
