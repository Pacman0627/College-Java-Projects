/*Cameron "CJ" Robinson 10/28/23
Page 196 Chapter 5 Problem 5.11
Write a program that displays all the numbers from 100 to 200
that are divisble by 5 or 6 but not both*/
import java.util.Scanner;

public class FindNumbersDivisibleby5or6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // StringBuilders to store numbers divisible by 5 and 6
        StringBuilder DivisibleBy5 = new StringBuilder();
        StringBuilder DivisibleBy6 = new StringBuilder();

        int number = 100;
        int By5LineCheck = 0; // Counter for formatting DivisibleBy5 output
        int By6LineCheck = 0; // Counter for formatting DivisibleBy6 output

        // Loop through numbers from 100 to 200 (Inclusive)
        while (number <= 200) {
            // Check for divisibility by 5 and 6
            int IsitDivisibleBy5 = number % 5;
            int IsitDivisibleBy6 = number % 6;

            // Check if the number is divisible by 5 or 6 but not both
            if (IsitDivisibleBy5 != IsitDivisibleBy6) {
                if (IsitDivisibleBy5 == 0) {
                    // Append number to DivisibleBy5 String
                    DivisibleBy5.append(number).append(" "); // Adds a space
                    By5LineCheck++;

                    // Add a newline every 5 numbers
                    if (By5LineCheck == 5) {
                        DivisibleBy5.append("\n");
                        By5LineCheck = 0;
                    }
                }
                if (IsitDivisibleBy6 == 0) {
                    // Append number to DivisibleBy6 String
                    DivisibleBy6.append(number).append(" "); // Adds a space 
                    By6LineCheck++;

                    // Add a newline every 5 numbers
                    if (By6LineCheck == 5) {
                        DivisibleBy6.append("\n");
                        By6LineCheck = 0;
                    }
                }
            }
            number++; // Move to the next number
        }

        // Output the numbers divisible by 5 and 6
        System.out.println("Numbers divisible by 5: \n" + DivisibleBy5);
        System.out.println("Numbers divisible by 6: \n" + DivisibleBy6);
    }
}
