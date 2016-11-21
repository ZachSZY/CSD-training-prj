package com.tennis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jiah on 2016/11/21.
 */
public class CourtService {
    private final List<Court> courts;
    private ReservationRepo reservationRepo;

    public CourtService(){
        courts = new ArrayList<Court>() {{
            add(new Court());
        }};
        reservationRepo = new ReservationRepo();
    }

    List<Court> getAllCourts(){
        return courts;
    }

    public boolean isReserved(Court court, Period period) {
        return reservationRepo.isReservationExist(new Reservation(court, period));
    }

    public boolean reserve(Court court, Period period) {
        Reservation reservation = new Reservation(court, period);
        if (reservationRepo.isReservationExist(reservation))
            return false;
        return reservationRepo.addReservation(reservation);
    }
}
