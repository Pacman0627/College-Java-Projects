import java.util.Scanner;

public class SolidSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an whole number
        System.out.print("Enter an whole number: ");
        int num = scanner.nextInt();


        // Display the square
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
