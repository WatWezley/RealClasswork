package chapterfour;

import java.util.Scanner;

        public class CryptoThought {
            public static void main(String[] args) {
                //collect user input as string
                //count userInput,
                //if userInput is equal to four
                // encrpyt
                //else
                //display error message and collect input again

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a four digit number");
                String userInput = scanner.nextLine();
                int numberOfDigit = userInput.length();
                if (numberOfDigit == 4) {
                    encrypt(userInput);
                }
                //0123
                //0
                //3120
                //1
                //3210
                //2

            }

            public static void encrypt(String userInput) {
                int fourthDigit = userInput.charAt(3);
                int thirdDigit = userInput.charAt(2);
                int secondDigit = userInput.charAt(1);
                int firstDigit = userInput.charAt(0);

                fourthDigit = (fourthDigit + 7) % 10;
                secondDigit = (secondDigit + 7) % 10;
                thirdDigit = (thirdDigit + 7) % 10;
                firstDigit = (firstDigit + 7) % 10;

                String swappedString = "" + fourthDigit + thirdDigit + secondDigit + firstDigit;

                System.out.println(swappedString);
            }


//
//    private static  String input(String prompt){
//        Scanner scanner = new Scanner(System.in);
//        display(prompt);
//        return scanner.nextLine();
//    }
//    private static void display(String prompt){
//        System.out.println(prompt);
//    }

        }












