/*Cameron "CJ" Robinson 09/28/23
Write a program that generates three single-digit intergers
and prompts the user to to enter the sum of these three intergers
Due 10/03/23*/
import java.util.Scanner;
   public class robinsoncj4hw3Num3AdditionQuiz {
      public static void main(String[] args) {
         // Create a Scanner object to read input from the user
         Scanner input = new Scanner(System.in);
      
      // Generate three random numbers between 0 and 9
      int number1 = (int)(System.currentTimeMillis() % 10);
      int number2 = (int)(System.currentTimeMillis() / 10 % 10);
      int number3 = (int)(System.currentTimeMillis() / 100 % 10);

      // Prompt the user to enter the answer to the addition question
      System.out.print(
         "What is " + number1 + " + " + number2 + " + " + number3 + "? ");
         
      // Read the user's input as an integer
      int answer = input.nextInt();
      
      // Checks if the user's answer is correct or incorrect 
         System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));

   }
}
