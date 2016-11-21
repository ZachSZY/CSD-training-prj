package com.tennis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuayang on 16/11/21.
 */
public class ReservationRepo {
    List<Reservation> reservations;
    public ReservationRepo() {
        reservations = new ArrayList<>();
    }

    public boolean addReservation(Reservation reservation) {
        reservations.add(reservation);
        return true;
    }

    public boolean delReservation(Reservation reservation) {
        return true;
    }
    public boolean isReservationExist(Reservation reservation) {
        for (Reservation r :
                reservations) {
            if (r.equals(reservation))
                return true;
        }
        return false;
    }

}
