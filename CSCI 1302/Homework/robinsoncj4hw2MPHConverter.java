/*Cameron "CJ" Robinson 09/14/23
Write a Java program that input from the user a certain speed in miles per hour (MPH).
It will print the same speed in kilometers per hour (KPH), meters per second (mps), and furlongs per fortnight.
Due 09/19/23 */
import java.util.Scanner;

public class robinsoncj4hw2MPHConverter {
    public static void main(String[] args) {
        Scanner converter = new Scanner(System.in);
    System.out.print("How Fast were you going in MPH? ");
        int MPH = converter.nextInt(); 
        int KPH = (int)(MPH * 1.609344 );
        int MPS = (int)(MPH * 0.44704 );
        int FPF = (int)(MPH * 2688 );
    System.out.print("Your were going " + KPH + " Kilometers Per Hour, " + MPS + " Meters Per Seconds, and " + FPF + " Furlongs Per Fortnight.");
}
}