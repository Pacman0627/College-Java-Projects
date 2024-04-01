import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Define the total number of questions
        final int TOTAL_QUESTIONS = 10;

        int QuestCount = 0;     // Initialize question counters
        int QuestCorrect = 0;
        int QuestWrong = 0;
        StringBuilder incorrectAnswers = new StringBuilder();

        long StartTime = System.currentTimeMillis(); // Record the start time

        while (QuestCount < TOTAL_QUESTIONS) {
            // Generate two random numbers between 1 and 100
            int Num1 = (int) ((Math.random() * 100) + 1);
            int Num2 = (int) ((Math.random() * 100) + 1);   // Could replace this line with -- int Num2 = (int)(Math.random() * Num1); -- and delete the if statement below.//

            // Ensure Num1 is greater than or equal to Num2
            if (Num2 > Num1) {
                int temp = Num1;
                Num1 = Num2;
                Num2 = temp;
            }

            // Calculate the correct answer
            int Answer = Num1 - Num2;

            System.out.print("What is " + Num1 + " - " + Num2 + "? ");
            int UserAnswer = reader.nextInt();

            if (UserAnswer == Answer) {
                System.out.println("Correct! " + UserAnswer + " is Correct.");
                QuestCount++;
                QuestCorrect++;
            } else if (UserAnswer > Answer) {
                System.out.println("Incorrect. " + UserAnswer + " is too high.");
                QuestCount++;
                QuestWrong++;
                incorrectAnswers.append("Q").append(QuestCount).append(": ").append(Num1).append(" - ").append(Num2).append(" = ").append(UserAnswer).append("\n");
            } else if (UserAnswer < Answer) {
                System.out.println("Incorrect. " + UserAnswer + " is too low.");
                QuestCount++;
                QuestWrong++;
                incorrectAnswers.append("Q").append(QuestCount).append(": ").append(Num1).append(" - ").append(Num2).append(" = ").append(UserAnswer).append("\n");
            } else {
                System.out.println("Invalid Input.");
            }
        }

        long EndTime = System.currentTimeMillis(); // Record the end time
        System.out.println("You got a score of " + 100 * QuestCorrect / TOTAL_QUESTIONS + "%");
        System.out.println("It took you " + (EndTime - StartTime) / 1000 + " seconds to complete this test.");
        System.out.println("Incorrect Answers:");
        System.out.println(incorrectAnswers.toString());
    }
}
