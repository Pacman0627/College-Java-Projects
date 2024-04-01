import java.util.Scanner;

public class PosNegCounter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter an integer, the sequence ends when a 0 is entered: ");
        int data = reader.nextInt();

        int sum = 0;
        int pos = 0;
        int neg = 0;

        while (data != 0) {
            // Check if the input is positive
            if (data > 0) {
                pos++;
            }
            // Check if the input is negative
            else if (data < 0) {
                neg++;
            }

            // Add the input to the sum
            sum += data;

            // Prompt the user for the next integer
            System.out.print("Enter an integer (If you want to stop enter 0): ");
            data = reader.nextInt();
        }

        // Calculate the average
        double average = (double) sum / (pos + neg);

        // Display the sum, counts of positive and negative numbers, and the average
        System.out.println("The sum of integers inputted is " + sum);
        System.out.println("The number of negative numbers inputted is " + neg);
        System.out.println("The number of positive numbers inputted is " + pos);
        System.out.println("The average of the entered numbers is " + average);
    }
}
