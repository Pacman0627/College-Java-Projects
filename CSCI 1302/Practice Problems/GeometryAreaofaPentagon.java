/* Cameron "CJ" Robinson 10/09/23
Page 150 Chapter 4 Problem 4.1
Write a program that prompts the user to enter the length from center of a pentagon
to a vertex and computes the area of the pentagon*/

import java.util.Scanner;

public class GeometryAreaofaPentagon {
    public static void main(String[] args) {
        Scanner equation = new Scanner(System.in);
        
    System.out.println("What is the length from the center to a vertex? ");
        double r = equation.nextDouble();
        
        
        double s = (2 * r * Math.sin(Math.PI/5));
        double Area = ((5 * Math.pow(s, 2))/(4*Math.tan(Math.PI/5)));
        
    System.out.printf("The area of the Pentagon is %.2f\n ", Area);
   
        }
        }