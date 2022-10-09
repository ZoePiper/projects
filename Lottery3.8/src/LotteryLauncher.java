/*@Zoe Piper 2022-10-08
 * This program generates random 2-digit numbers
 * Prompt a 2-digit number
 * And determines if you're a winner if
 * 1. all nummers match in the correct order
 * 2. all numbers match but nit in the correct order
 * 3 only one digit matches
 * And then you win*/

import java.util.Scanner;

public class LotteryLauncher {
    public static void main(String[] args) {

        // generate  random number
//        int luckyNumber = (int) (Math.random() * 100);
       int luckyNumber = 25; //testcase

        //Prompt user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in your lottery number (2-digits): ");
        int guessNumber = scanner.nextInt();

        //Separate the lucky numbers
        int guessNumber1 = guessNumber / 10; // int cuts behind the comma off
        int guessNumber2 = guessNumber % 10; // keeps the rest after 10

        //Separate the guessing numbers
        int luckyNumber1 = luckyNumber / 10; // int cuts behind the comma off
        int luckyNumber2 = luckyNumber % 10; // keeps the rest after 10

        System.out.println(" Drum roll, please!!!!\n The lucky numer is: "
                + luckyNumber);
        System.out.println();

        //Check the numbers for a prize
        if (guessNumber == luckyNumber) {
            System.out.println(" All numbers are matching. " +
                    "You are the winner of 10.000 ");
        } else if (guessNumber1 == luckyNumber2 &&
                guessNumber2 == luckyNumber1) {
            System.out.println(" You have the same numbers " +
                    "but not in the correct order. You win 3.000");
        } else if (guessNumber1 == luckyNumber1 ||
                guessNumber1 == luckyNumber2
                || guessNumber2 == luckyNumber1
                || guessNumber2 == luckyNumber2) {
            System.out.println("One number is matching, " +
                    "so you win the poodle prize: 1.000");
        } else {
            System.out.println(" No match. Try again");
        }
    }
}
:)
