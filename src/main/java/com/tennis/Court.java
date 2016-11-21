package com.tennis;


import java.time.Duration;

/**
 * Created by jiah on 2016/11/21.
 */
public class Court {
    private int x;
    private int y;

    public Court(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
