package chapterEight.reflection;

public class Problem {

    private String name;

    private ProblemType type;

    private boolean isSolved;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(ProblemType type) {
        this.type = type;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }
}
