package chapterEight.reflection;

import java.util.ArrayList;

public class PersonProblem {


    private ArrayList<Problem> problems;

    public PersonProblem(ArrayList<Problem> problems) {
        this.problems = problems;
    }

    public String tellProblem() {
        String ourProblem = "";
        for(Problem problem: problems){
            System.out.println("""
                    Name:
                    Problem Type:
                    Status:
                    """);
            


        
    }return ourProblem;
}




}
