/*Cameron "CJ" Robinson 10/10/23
Write a program to calculate the area of a triangle. 
Give the user the option of two different ways to enter their triangle information: 
Either they can provide the length of each side (a, b, and c -- known as Side-Side-Side or SSS), 
or they can provide the length of any two sides plus the angle between (a, C, and b -- Side-Angle-Side or SAS). 
Due 10/17/23*/

import java.util.Scanner;

public class robinsoncj4hw5AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean validChoice = false;  // Flag to track if the choice is valid

        while (!validChoice) {
            System.out.println("1. Calculate area with SSS (Side-Side-Side)");
            System.out.println("2. Calculate area with SAS (Side-Angle-Side)");
            System.out.println("3. Calculate area with ASA (Angle-Side-Angle)");

            int choice = input.nextInt();

            if (choice == 1) {
                // SSS (Side-Side-Side) method
                System.out.println("Enter the length of side a:");
                double a = input.nextDouble();

                System.out.println("Enter the length of side b:");
                double b = input.nextDouble();

                System.out.println("Enter the length of side c:");
                double c = input.nextDouble();

                // Calculate the semiperimeter, Given with instructions
                double s = (a + b + c) / 2.0;

                // Calculate the area using Heron's formula, Given with instructions
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                System.out.println("The area of the triangle is: " + area);
                validChoice = true;  // Set the flag to true to exit the loop
            } else if (choice == 2) {
                // SAS (Side-Angle-Side) method
                System.out.println("Enter the length of side a: ");
                double a = input.nextDouble();

                System.out.println("Enter the length of side b: ");
                double b = input.nextDouble();

                System.out.println("Enter the measure of angle C (in degrees): ");
                double angleC = (input.nextDouble());

                // Calculate the area using SAS formula, Given with instructions
                double area = ((a * b * Math.sin(angleC))/2);

                System.out.println("The area of the triangle is: " + area);
                validChoice = true;  // Set the flag to true to exit the loop
            } else if (choice == 3) {
                // ASA (Angle-Side-Angle) method
                System.out.println("Enter the measure of angle A (in degrees):");
                double angleA = (input.nextDouble());

                System.out.println("Enter the length of side b:");
                double b = input.nextDouble();

                System.out.println("Enter the measure of angle B (in degrees):");
                double angleB = (input.nextDouble());

                // Calculate the area using ASA formula, got from Chat
                double area = 0.5 * b * b * Math.sin(angleA) * Math.sin(angleB) / Math.sin(Math.PI - angleA - angleB);

                System.out.println("The area of the triangle is: " + area);
                validChoice = true;  // Set the flag to true to exit the loop
            } else {
                System.out.println("Invalid choice. Please choose 1 for SSS, 2 for SAS, or 3 for ASA.");
            }
        }
    }
}
