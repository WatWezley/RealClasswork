package Chapter14String;

public class StringBuilders {

    public static void main(String[] args) {

        String name = "Zainab";
        String tempValue = name;
        name+=" Ayo";
        System.out.println(name);
        System.out.println(tempValue);


        System.out.println();
        StringBuilder stringBuilder = new StringBuilder("Favour");
        StringBuilder value = stringBuilder;
        stringBuilder.append("ayo");
        System.out.println(stringBuilder);
        stringBuilder.ensureCapacity(7);
        StringBuilder experiment = new StringBuilder(3);
        experiment.ensureCapacity(3);
        System.out.println(experiment.capacity());
        System.out.println(experiment.length());
        experiment.append("Kabir");
        System.out.println(experiment.capacity());
        System.out.println(experiment.length());
        System.out.println(experiment);

    }
}
