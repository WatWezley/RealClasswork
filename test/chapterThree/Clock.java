package chapterThree;

import java.util.Scanner;

public class Clock {

    private int hours;
    private int minutes;

    private int sec;

    private String time;


    public Clock(int hours, int minutes, int sec) {
        this.hours = hours;
        this.minutes = minutes;
        this.sec = sec;
    }


    public void setHours(int hours) {
        if (hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }


    public int getHours() {
        return hours;
    }


    public void setMinutes(int minutes) {
        if (minutes <= 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }


    public int getMinutes() {
        return minutes;
    }


    public void setSec(int sec) {
        if (sec <= 60) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }


    public int getSec() {
        return sec;
    }

    public void setDisplayTime(int hours, int minutes, int sec) {
       time = System.out.printf("%d:%d:%d%n", getHours(), getMinutes(), getSec()).toString();
    }

    public String getDisplayTime() {
        return time;
    }

}