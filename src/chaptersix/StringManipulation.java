package chaptersix;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = "";
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println(addFullStop(capitalizeWord(word)));
    }


    public static String addFullStop(String word) {
        if (word.endsWith("."))
            return word;
        else
            word = word + ".";
            return word;
    }


    public static String capitalizeWord(String word) {
//        return word.replace(word.charAt(0), Character.toUpperCase(word.charAt(0)));
//        return word.replaceFirst(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(0)).toUpperCase());
        String firstLetter = String.valueOf(word.charAt(0));
        return word.replaceFirst(firstLetter, firstLetter.toUpperCase());
    }
}


