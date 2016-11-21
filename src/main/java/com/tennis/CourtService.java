package com.tennis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiah on 2016/11/21.
 */
public class CourtService {
    private final List<Court> courts;

    public CourtService(){
        courts = new ArrayList<Court>() {{
            add(new Court());
        }};
    }

    List<Court> getAllCourts(){
        return courts;
    }
}
