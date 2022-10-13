import java.util.Scanner;

public class SubstractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;//count the correct answers
        int count = 0; // count the nr of questions
        long startTime = System.currentTimeMillis();// timer start when program starts
        String output = " "; //output is empty at the beginning
        Scanner scanner = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            //generate 2 random numbers
            int nr1 = (int) (Math.random() * 10);
            int nr2 = (int) (Math.random() * 10);

            //Biggest nr first swap numbers
            if (nr1 < nr2) {
                int temp = nr1;
                nr1 = nr2;
                nr2 = temp;
            }
            //Ask use the questions
            System.out.println("What is " + nr1 + " - " + nr2 + " ?");
            int answer = scanner.nextInt();

            //Grade answer
            if (nr1 - nr2 == answer) {
                System.out.println("Correct");
                correctCount++;
            } else {
                System.out.println(" Wrong! Answer is" + nr1 + " - " + nr2 + " = " + (nr1 - nr2));
            }
            count++;// increase to get the next question till Q5

            output += "\n" + nr1 + " - " + nr2 + " = " + answer + ((nr1 - nr2 == answer) ? " correct" : " wrong");
            // saves the output per question
        }//end while
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;//set time

        System.out.println("Correct count is "+correctCount+"\nTest time is "+testTime/1000+ " seconds\n"+output);
        // convert to seconds
    }
}
