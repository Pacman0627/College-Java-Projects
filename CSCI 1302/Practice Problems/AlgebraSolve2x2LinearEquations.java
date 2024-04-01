/*Cameron "CJ" Robinson 10/03/23
Page 109 Chapter 3 Problem 3.3
Write a program that prompts the user to enter 
a, b, c, d, e, and and displays the result.*/

import java.util.Scanner;
   public class AlgebraSolve2x2LinearEquations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter a Numerical Value for A: ");
         double a = reader.nextDouble();
        System.out.println("Enter a Numerical Value for B: ");
         double b = reader.nextDouble();
        System.out.println("Enter a Numerical Value for C: ");
         double c = reader.nextDouble();
        System.out.println("Enter a Numerical Value for D: ");
         double d = reader.nextDouble();
         System.out.println("Enter a Numerical Value for E: ");
         double e = reader.nextDouble();
        System.out.println("Enter a Numerical Value for F: ");
         double f = reader.nextDouble();
         
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        
         if ((a*d) - (b*c) == 0) {
            System.out.println("The Equation has no Solution");
        } else {
            System.out.println("X is " + x + ", and Y is " + y);
            
            }
            }
            }         
      