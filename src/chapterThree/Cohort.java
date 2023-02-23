package chapterThree;

public class Cohort {

    private String currentCourse;
    private String period;
    private int payment;


    public void updateCurrentCourse(String newCurrentCourse){
        currentCourse = newCurrentCourse;
    }

    public String whatsCurrentCourse(){
        return currentCourse;
    }

    public void updatePeriod(String newPeriod){
        period = newPeriod;
    }

    public String whatsPeriod(){
        return period;
    }

    public void payment(int newPayment){
        payment = newPayment;
    }

    public int newPayment(){
        return payment;
    }

}