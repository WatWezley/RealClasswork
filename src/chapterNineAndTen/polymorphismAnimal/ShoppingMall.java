package chapterNineAndTen.polymorphismAnimal;

public class ShoppingMall {

    public static void main(String[] args) {

        BoyFriend allwell = new IlasaBoy();



        Girl miracle = new Girl(allwell);

        miracle.spend(5000);

        System.out.println(miracle.spend(5000));

    }
}

