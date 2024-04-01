/*Cameron "CJ" Robinson 10/17/23
Page 157 Chapter 4 Problem 4.24
Write a program that prompts the user to enter three cities
and displays them in ascending order*/
import java.util.Scanner;

public class OrderThreeCities {
    public static void main (String [] args)    {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first City: ");
        String city1 = reader.nextLine();
        System.out.print("Enter the second City: ");
        String city2 = reader.nextLine();
        System.out.print("Enter the third City: ");
        String city3 = reader.nextLine();

        if (city1.compareTo(city2) < 0) {
            if (city1.compareTo(city3) < 0) {
                if (city2.compareTo(city3) < 0) {
                    System.out.println("The alphabetical order is: " + city1 + ", " + city2 + ", " + city3);
                } else {
                    System.out.println("The alphabetical order is: " + city1 + ", " + city3 + ", " + city2);
                }
            } else {
                System.out.println("The alphabetical order is: " + city3 + ", " + city1 + ", " + city2);
            }
        } else {
            if (city2.compareTo(city3) < 0) {
                if (city1.compareTo(city3) < 0) {
                    System.out.println("The alphabetical order is: " + city2 + ", " + city1 + ", " + city3);
                } else {
                    System.out.println("The alphabetical order is: " + city2 + ", " + city3 + ", " + city1);
                }
            } else {
                System.out.println("The alphabetical order is: " + city3 + ", " + city2 + ", " + city1);
            }
        }
    }
}
