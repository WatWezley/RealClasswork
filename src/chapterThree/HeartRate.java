package chapterThree;

public class HeartRate {

    private String firstName;

    private String lastName;

    private String day;

    private  String month;

    private String years;

    private int age;

    private int mHR;


    public HeartRate(String firstName, String lastName, String day,String month, String years){
        this.lastName = lastName;
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.years = years;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }


    public  String getFirstName(){
        return firstName;
    }

    public void setLastName( String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setDay( String day){
        this.day = day;
    }

    public String getDay(){
        return day;
    }

    public void  setMonth(String month){
        this.month = month;
    }

    public String getMonth(){
        return month;
    }

    public void  setYears(String years){
        this.years = years;
    }

    public String getYears(){
        return years;
    }

    public String dateOfBirth(){
        String dob = day + "/" + month + "/" + years;
        return dob;
    }

    public int age(){
        int years = Integer.valueOf(getYears());
        int age = 2022 - years;
        return age;
    }

    public int maximumHeartRate(int age){
        int mHR = 220 - age;
        return mHR;
    }

    public String targetHeartRate(int mHR) {
        double miniTHR = 0.5 * mHR;
        String Min=String.valueOf(miniTHR);
        double maxTHR = 0.85 * mHR;
        String Max = String.valueOf(maxTHR);
        String THR = Min + " - " + Max;
    return THR ;
    }
}
