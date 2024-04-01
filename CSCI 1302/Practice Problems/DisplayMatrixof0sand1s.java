/*Cameron "CJ" Robinson 11/15/23
Page 240 Chapter 6 Problem 6.17
Write a method that displays an n-by-n matrix*/

import java.util.Scanner;

public class DisplayMatrixof0sand1s {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");
        int n = in.nextInt();

        // Call the printMatrix method to generate and display the matrix
        printMatrix(n);
    }
    public static int printMatrix(int n) {
        // Iterate through each row
        for (int i = 0; i < n; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < n; j++) {
                // Generate a random 0 or 1 and print it followed by a space
                System.out.print((int) (Math.random() * 2) + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        // Return the size of the matrix (n), although it's not used in this example
        return n;
    }
}
