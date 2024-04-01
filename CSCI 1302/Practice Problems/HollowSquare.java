import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer from 1 to 15
        System.out.print("Enter an integer between 1 and 15: ");
        int num = scanner.nextInt();

        // Display the hollow square
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                // Print '*' for the first and last row, and for the first and last column
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for the inner area
                }
            }
            System.out.println();
        }
    }
}
