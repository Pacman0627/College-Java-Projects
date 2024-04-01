/* Cameron "CJ" Robinson 9/10/23
Page 72 Chapter 2 Problem 2.16
Write a progam that prompts the user to enter a side of a heaxagon (6-Sides), and displays the area.*/

import java.util.Scanner;
   public class GeometryDistanceofTwoPoints {
      public static void main(String [] args){
         Scanner reader = new Scanner(System.in);
         
         System.out.print("What is a side length of the Hexagon? ");
            double Side = reader.nextDouble();
            double Area = ((3 * Math.sqrt(3))/2 * Math.pow(Side,2));
         
         System.out.print("If your Heaxgon's side is equal to " + Side + " then the area of your Heaxgon is " + Area);
         
         
         
  
  }
  }
