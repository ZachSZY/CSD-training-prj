package com.tennis;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shuayang on 16/11/21.
 */
public class CourtRepo {
    private static final Map<Court, Period> reserved = new HashMap<>();

    public CourtRepo() {
    }

    public boolean isReserved(Court court, Period duration) {
        return duration.equals(reserved.get(court));
    }

    public void reserve(Court court, Period duration) {
        reserved.put(court, duration);
    }

    public void release(Court court, Period duration) {
        reserved.remove(court);
    }
}
