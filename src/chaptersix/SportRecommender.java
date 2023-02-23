package chaptersix;

public class SportRecommender {

    public static void sportChecking(int degrees){
        if (degrees >= 20 && degrees <=30){
            System.out.println("Its a lovely weather for sports today");}
        if(degrees >= 10 && degrees <=40){
            System.out.println("Its a reasonable weather for sports today");}
        else
        {System.out.println("Please exercise with care today, watch out for the weather");
        }

    }
}
