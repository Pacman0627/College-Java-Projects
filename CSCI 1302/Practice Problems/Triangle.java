import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer from 1 to 15
        System.out.print("Enter an integer between 1 and 15: ");
        int num = scanner.nextInt();

        // Display the full triangle
        for (int i = 1; i <= num; i++) {
         // Print asterisks for the triangle
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
