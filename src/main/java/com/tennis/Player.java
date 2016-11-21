package com.tennis;

import java.time.Duration;
import java.util.Date;

/**
 * Created by jiah on 2016/11/21.
 */
public class Player {
    public Court search() {
        return new Court();
    }

    public Boolean reserve(Court court, Period time) {
        return true;
    }
}
