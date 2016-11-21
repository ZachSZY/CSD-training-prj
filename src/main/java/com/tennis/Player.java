package com.tennis;

import java.util.List;
import java.time.Duration;
import java.util.Date;

/**
 * Created by jiah on 2016/11/21.
 */
public class Player {
    CourtService service = new CourtService();
    private int x;
    private int y;

    public void setLocation(int currentX,int currentY){
        x = currentX;
        y = currentY;
    }

    public int[] getLocation(){

        int[] location = new int[2];
        location[0] = x;
        location[1] = y;
        return location;
    }


    public Court search() {
        List<Court> courts = service.getAllCourts();
        if(courts.isEmpty())
            return null;
        else {
            double d = - Math.pow(Math.abs(x-courts.get(0).getX()),Math.abs(y-courts.get(0).getY()));
            int c = 0;
            for(int i=1;i<courts.size();i++){
                double dis = Math.pow(Math.abs(x-courts.get(i).getX()),Math.abs(y-courts.get(i).getY()));
                if(dis < d){
                    d = dis;
                    c = i;
                }
            }
            return courts.get(c);
        }
    }

    public Boolean reserve(Court court, Period time) {
        return service.reserve(court, time);
    }

    public boolean share(Court court, Period period, Player anotherPlayer) {
        if (service.isReserved(court, period))
            return true;
        return false;
    }
}
