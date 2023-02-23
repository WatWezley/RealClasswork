package chapterNineAndTen.polymorphismAnimal;

public class Girl {
    
    public BoyFriend boyFriend = new IlasaBoy();
    
    public Girl(BoyFriend boyFriend){
        this.boyFriend=boyFriend;
    }

    public void setBoyFriend(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }

    public String spend(int amount){
        return boyFriend.spend(amount);
    }
}
