import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer from 1 to 15
        System.out.print("Enter an integer between 1 and 15: ");
        int num = scanner.nextInt();

        // Ensure the input is within the range 1-15
        if (num < 1 || num > 15) {
            System.out.println("Please enter a number between 1 and 15.");
        } else {
            // Display the pyramid
            for (int i = 1; i <= num; i++) {    //Sets i to 1, and states that if i is less than or equal to user's number go the line below, and then add 1 to i.
                // Add spaces to align the pyramid
                for (int j = 1; j <= num - i; j++) {  //Sets j to 1, and states if j is less than or equal to user's number minus i print the next line, and then add 1 to j. 
                    System.out.print("  ");
                }
                // Display numbers in ascending order
                for (int j = 1; j <= i; j++) {  //Sets j to 1, and states that if j is less than or equal to i then print the line below, and add one to j
                    System.out.print(j + " ");
                }
                // Display numbers in descending order
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
