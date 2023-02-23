package tdd;

public class Bike {
    private boolean kick;

    private int speed;


    public void setOn(boolean value) {
        kick = true;
    }

    public boolean getSetOn() {
        return kick;
    }

    public void setoff(boolean value) {
        kick = false;

    }

    public boolean getSetOff() {
        return kick;
    }

    public void accelerate(int gear) {
        if (gear > 0 && gear <= 20) {
            speed = gear + 1;
        } else if (gear >= 21 && gear <= 30) {
            speed = gear + 2;
        } else if (gear >= 31 && gear <= 40) {
            speed = gear + 3;
        } else {
            speed = gear + 4;
        }
    }

    public int getaccelerate() {
        return speed;
    }

    public void decelerate(int gear) {
        if (gear > 0 && gear <= 20)
            speed = gear - 1;
        else if (gear >= 21 && gear <= 30)
            speed = gear - 2;
         else if (gear >= 31 && gear <= 40)
            speed = gear - 3;
         else
            speed = gear - 4;

    }

    public int getdecelerate() {
        return speed;
    }
}
