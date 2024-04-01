/*Cameron "CJ" Robinson 10/03/23
Page 111 Chapter 3 Problem 3.18
Write a program that prompts the user to enter the weight of the package and displays the the shipping cost
*/
import java.util.Scanner;

public class CostofShipping {
    public static void main(String[] args) {
        Scanner equation = new Scanner(System.in);
        
        System.out.println("What is the weight of the package in pounds? ");
        double Weight = equation.nextDouble();
        
        
        if (Weight <= 0) {
            System.out.println("Invalid input.");
            
         } else if (Weight >= 20) {
            System.out.println("The package cannot be shipped.");
            
         } else if (Weight >= 0 && Weight <= 1) {
         System.out.println(3.5 * Weight);
         
         } else if (Weight >= 1 && Weight <= 3) {
         System.out.println(5.5 * Weight);
         
         } else if (Weight >= 3 && Weight <= 10) {
         System.out.println(8.5 * Weight);
         
         } else if (Weight >= 10 && Weight < 20) {
         System.out.println(3.5 * Weight);


        

        }
        }
        
        }
