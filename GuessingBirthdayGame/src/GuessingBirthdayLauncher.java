import java.util.Scanner;
/* This is a guessing game for de day of your birthday.
By showing a few numbers and asking if your number is in this set
the first number of all the sets where your day is in are added together
The sum of this is your day.
* */
public class GuessingBirthdayLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // show the sets
        String set1 = " 1  3  5  7\n" +
                " 9 11 13 15 \n" +
                "17 19 21 23\n" +
                "25 27 29 31";
        String set2 = " 2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31\n";
        String set3 = " 4  5  6  7 \n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31\n";
        String set4 = " 8  9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        String set5 = "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        int day = 0;

        // Questions
        System.out.println(" this is the first set\n" + set1);
        System.out.println("Question 1: Is your birthday in set 1?");
        System.out.println("For a Yes enter 1, for a No enter 1: ");
        int answer = scanner.nextInt();

        //Every time the user enters yes the first number of the set is added.
        if (answer == 1)
            day += 1;

        System.out.println(" this is the second set\n" + set2);
        System.out.println("Question 1: Is your birthday in set 2?");
        System.out.println("For a Yes enter 1, for a No enter 1: ");
         answer = scanner.nextInt();
        if (answer == 1)
            day += 2;

        System.out.println(" this is the third set\n" + set3);
        System.out.println("Question 1: Is your birthday in set 3?");
        System.out.println("For a Yes enter 1, for a No enter 1: ");
         answer = scanner.nextInt();
        if (answer == 1)
            day += 4;

        System.out.println(" this is the forth set\n" + set4);
        System.out.println("Question 1: Is your birthday in set 4?");
        System.out.println("For a Yes enter 1, for a No enter 1: ");
         answer = scanner.nextInt();
        if (answer == 1)
            day += 8;

        System.out.println(" this is the fifth set\n" + set5);
        System.out.println("Question 1: Is your birthday in set 5?");
        System.out.println("For a Yes enter 1, for a No enter 1: ");
         answer = scanner.nextInt();
        if (answer == 1)
            day += 16;

        System.out.println("Your birthday is on the : " + day+"!");

    }
}
