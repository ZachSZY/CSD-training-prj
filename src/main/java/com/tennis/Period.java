package com.tennis;

import java.time.LocalTime;
import java.util.Date;

/**
 * Created by shuayang on 16/11/21.
 */
public class Period {
    private Date start;
    private Date end;

    private Period(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public static Period between(Date start, Date end) {
        return new Period(start, end);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Period period = (Period) o;

        if (start != null ? !start.equals(period.start) : period.start != null) return false;
        return end != null ? end.equals(period.end) : period.end == null;

    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }
}
