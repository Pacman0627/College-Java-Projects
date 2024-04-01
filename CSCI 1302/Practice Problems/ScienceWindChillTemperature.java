/*Cameron "CJ" Robinson 09/25/2023
Page 111 Chapter 3 Problem 3.20
Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether temperature and/or wind speed is invalid*/
import java.util.Scanner;
   public class ScienceWindChillTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit between -58 and 41 Degrees Fahrenheit: ");
        int Temp = scanner.nextInt();

        // Prompt the user to enter the wind speed in MPH
        System.out.println("Enter the wind speed if above 2 MPH: ");
        int Wind = scanner.nextInt();

        // Check if the entered temperature is outside the valid range
        if (Temp < -58 || Temp > 41) {
            System.out.println("Invalid temperature. Try Again");
        }
        // Check if the entered wind speed is less than or equal to 2 MPH
        else if (Wind <= 2) {
            System.out.println("Invalid wind speed. Try Again.");
        } else {
            // Calculate the wind chill using the provided formula
            double WindChill = 35.74 + 0.6215 * Temp - 35.75 * Math.pow(Wind, 0.16) + 0.4275 * Temp * Math.pow(Wind, 0.16);
            
            // Display the calculated wind chill
            System.out.println("Wind Chill: " + WindChill);
        }
    }
}
