package chapterEight.ExceptionHandling;

public class time {

    private int hours;
    private int minutes;
    private int seconds;

    public time(int hours, int minutes, int seconds) {
        validate(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    //this is assign the method roll to another
    public time(int hours,int minutes){
        this(hours,minutes,0);
    }

    public time(int hours){
        this(hours,0,0);
    }

    public time(){

    }


    private static void validate(int hours, int minutes, int seconds) {
        validateHours(hours);
        validateMinutes(minutes);
        validateSeconds(seconds);

    }

    private static void validateHours(int hours) {
        boolean hourIsInvalid = hours < 0 || hours > 23;
        if (hourIsInvalid) throw new IllegalArgumentException("Hours is invalid");

    }

    private static void validateMinutes(int minutes) {
        boolean minutesIsInvalid = minutes < 0 || minutes > 23;
        if (minutesIsInvalid) throw new IllegalArgumentException("Minutes is invalid");

    }

    private static void validateSeconds(int seconds) {
        boolean secondIsInvalid = seconds < 0 || seconds > 23;
        if (secondIsInvalid) throw new IllegalArgumentException("Minutes is invalid");

    }
}
