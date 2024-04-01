import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an odd integer from 1 to 15
        System.out.print("Enter an odd integer between 1 and 15: ");
        int num = scanner.nextInt();

        // Ensure the input is within the range 1-15 and is an odd number
        if (num % 2 == 0) {
            System.out.println("Please enter an odd number between 1 and 15.");
        }

        // Display the diamond pattern
        int midRow = (num + 1) / 2;
        for (int i = 1; i <= num; i++) {
            int spaces = Math.abs(midRow - i);
            int stars = num - 2 * spaces;

            // Print spaces for alignment
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the diamond
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
