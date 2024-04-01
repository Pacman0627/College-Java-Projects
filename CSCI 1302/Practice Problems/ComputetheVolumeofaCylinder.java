/*Cameron "CJ" Robinson 09/19/23
Page 69 Chapter 2 Problem 2.2 
Write a program that reads in the radius and length of a cylinder
and computes the area and volume*/
import java.util.Scanner;
   public class ComputetheVolumeofaCylinder {
      public static void main(String[] args) {
         Scanner converter = new Scanner(System.in);
         
         System.out.println("Whats the radius of your cylinder? ");
            double Radius = converter.nextDouble();
         System.out.println("Whats the length of your cylinder? ");
            double Length = converter.nextDouble();
            
            double Area = (Radius * Radius * Math.PI);
            double Volume = (Area * Length);
           
         System.out.println("So if your cylinder's radius is " + Radius + ", and your length is " + Length + " then the area of your cylinder is " + Area);
         System.out.println("If your cylinder's area is " + Area + " then its volume is " + Volume);

            
       
   }
}