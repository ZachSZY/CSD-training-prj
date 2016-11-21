package com.tennis;

import java.util.List;
import java.time.Duration;
import java.util.Date;

/**
 * Created by jiah on 2016/11/21.
 */
public class Player {
    CourtService service = new CourtService();

    public Court search() {
        List<Court> courts = service.getAllCourts();
        if(courts.isEmpty())
            return null;
        else
            return courts.get(0);
    }

    public Boolean reserve(Court court, Period time) {
        return service.reserve(court, time);
    }
}
