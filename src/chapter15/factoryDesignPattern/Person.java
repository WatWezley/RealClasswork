package chapter15.factoryDesignPattern;

public class Person implements  Human{

    private String name;

    private Person(){ }

    public static Human get(){
        var p = new Person();
        p.name = "Zainab";
        return p;
    }
}
