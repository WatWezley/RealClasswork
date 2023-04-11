package Chapter14String;

public class Example3 {

    public static void main(String[] args) {
        String x = "door";
        String y = "fat";
        String z = "Doeg";
        System.out.println(y.compareTo(x));
        System.out.println(x.compareTo(z));
        if(y.compareTo(x) > 0){
            System.out.println("ok");


        String name = "book";
        String newName = name.substring(1);
            System.out.println(newName);

            StringBuilder str = new StringBuilder("Josh");
            str = new StringBuilder("Oluwakuse");
            System.out.println(str);


        }


    }
}
