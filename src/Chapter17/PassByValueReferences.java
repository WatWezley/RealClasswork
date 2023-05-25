package Chapter17;

public class PassByValueReferences {

    public static void main(String[] args) {

        String name = "tinu";
        String nativ = name;
        System.out.println(nativ);

        nativ = "Obele";
        System.out.println(nativ);
        System.out.println(name);
    }
}
