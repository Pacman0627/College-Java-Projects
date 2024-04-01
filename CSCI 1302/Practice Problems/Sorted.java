/*Cameron "CJ" Robinson 1/15/24
Page 282 Chapter 7 Problem 7.19
Write a program with a method that returns true if a list of numbers is already sorted in nondecreasing order*/

import java.util.Scanner;
import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter the size of the list
        System.out.println("Enter the size of the list: ");
        int size = reader.nextInt();

        // Create an array to store the list elements
        int[] contentsArray = new int[size];

        // Take user input for the array elements
        System.out.println("Enter the contents of the list: ");
        for (int i = 0; i < size; i++) {
            // Validate user input to ensure it's an integer
            while (!reader.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer: ");
                reader.next(); // Consume the invalid input
            }
            contentsArray[i] = reader.nextInt();
        }

        // Print the result about the list size and contents
        System.out.println("The list has " + size + " integers: " + Arrays.toString(contentsArray));

        // Check if the array is sorted
        boolean sorted = isSorted(contentsArray);
        System.out.println("Is the array sorted? " + sorted);
    }

    /**
     * Checks if an array of integers is sorted in non-decreasing order.
     *
     * @param list The array to be checked.
     * @return True if the array is sorted, false otherwise.
     */
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // If an element is greater than its next element, the array is not sorted
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        // If the loop completes without returning false, the array is sorted
        return true;
    }
}
