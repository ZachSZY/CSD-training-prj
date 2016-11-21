package com.tennis;

import java.util.List;

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

    public Boolean reserve(Court court) {
        return true;
    }
}
