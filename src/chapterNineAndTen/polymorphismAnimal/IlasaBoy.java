package chapterNineAndTen.polymorphismAnimal;

public class IlasaBoy implements BoyFriend {

    @Override
    public String spend(int amount) {
        return "Spend" + (amount/4);
    }

}
