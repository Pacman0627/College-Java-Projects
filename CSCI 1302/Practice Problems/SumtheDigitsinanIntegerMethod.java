/*Cameron "CJ" Robinson 11/15/23
Page 236 Chapter 6 Problem 6.2
Write a method that computes the sum of the digits in an integer*/
import java.util.Scanner;

public class SumtheDigitsinanIntegerMethod {
    public static void main(String[] args) {
        Scanner addition = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000. ");
        long n = addition.nextLong();

        System.out.println("The sum of the digits is: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int answer = 0;
        while (n != 0) {
            long result = n % 10;
            answer += result;
            n = n / 10;
        }
        return answer;
    }
}
