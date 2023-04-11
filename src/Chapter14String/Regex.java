package Chapter14String;

import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String userInput = "email@gmail.com";

        System.out.println(userInput.matches("[a-z]+@[a-z]+\\.[a-z]{2,}"));

        System.out.println(Pattern.matches("[a-z]+@[a-z]+\\.[a-z]{2,}",userInput));


    }
}
