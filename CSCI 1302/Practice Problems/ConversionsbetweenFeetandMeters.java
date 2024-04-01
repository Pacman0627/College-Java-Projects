/*Cameron "CJ" Robinson 11/09/23
Page 238 Chapter 6 Problem 6.9
Write a class that contains two methods: footToMeter, and meterToFoot*/
import java.util.Scanner;

public class ConversionsbetweenFeetandMeters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("1). Feet to Meters");
        System.out.println("2). Meters to Feet");
        int choice = reader.nextInt();
       
       if (choice == 1) {
        System.out.print("Enter the distance in Feet to convert to Meters: ");
            double foot = reader.nextInt();
        System.out.println("After Converting your new distance in Meters is " + footToMeter(foot) + ".");
       }else if (choice == 2) {    
        System.out.print("Enter the distance in Meters to convert to Feet: ");
            double meter = reader.nextInt();       
         System.out.println("After Converting your new distance in Feet is " + meterToFoot(meter) + ".");
        }else{
         System.out.println("Please enter either 1 or 2");
         }
            }
    public static double footToMeter(double foot)  {
         double MeterConversion = (.305 * foot);
         return MeterConversion;
            }
    public static double meterToFoot(double meter)  {
         double FeetConversion = (3.279 * meter);
            return FeetConversion;
            }
            
}
