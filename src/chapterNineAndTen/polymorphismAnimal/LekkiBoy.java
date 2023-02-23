package chapterNineAndTen.polymorphismAnimal;

public class LekkiBoy implements BoyFriend {

    @Override
    public String spend(int amount) {
        return "spend"+ (amount*2)+"\nYour kidney in exchange";
    }
}
