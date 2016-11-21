package com.tennis;

/**
 * Created by shuayang on 16/11/21.
 */
public class Reservation {
    private Court court;
    private Period period;
    public Reservation(Court court, Period period) {
        this.court = court;
        this.period = period;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (court != null ? !court.equals(that.court) : that.court != null) return false;
        return period != null ? period.equals(that.period) : that.period == null;

    }

    @Override
    public int hashCode() {
        int result = court != null ? court.hashCode() : 0;
        result = 31 * result + (period != null ? period.hashCode() : 0);
        return result;
    }
}
