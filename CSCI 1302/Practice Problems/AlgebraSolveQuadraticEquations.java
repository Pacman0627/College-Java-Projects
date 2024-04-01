/*Cameron "CJ" Robinson 9/28/2023
Page 108 Chapter 3 Problem 3.1
Write a program that prompts the user to enter values
and displays the roots of the numbers based on the discriminant.
If positive display two roots, if 0 display one root, otherwise display no real roots*/

import java.util.Scanner;

public class AlgebraSolveQuadraticEquations {
    public static void main(String[] args) {
        Scanner equation = new Scanner(System.in);

        System.out.println("Enter a Value for A: ");
        int a = equation.nextInt();
        System.out.println("Enter a Value for B: ");
        int b = equation.nextInt();
        System.out.println("Enter a Value for C: ");
        int c = equation.nextInt();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant >= 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("Root 1 (r1): " + r1);
            System.out.println("Root 2 (r2): " + r2);
        } else {
            System.out.println("No real roots exist.");
        }
    }
}
