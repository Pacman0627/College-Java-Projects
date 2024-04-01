/*Cameron "CJ" Robinson 9/12/23 
Page 69 Chapter 2 Problem 2.1*
Write a program that reads Celsius and converts it to Fahrenheit*/
import java.util.Scanner;

public class ConvertCelsiustoFahrenheit {
  public static void main(String [] args){
 
Scanner reader = new Scanner(System.in);
 	System.out.println("What is the temperture in Celsius?");
 	int celsius = reader.nextInt();
// celsius to farenheit conversion from google
   int farenheit = (int)(celsius * (1.8)) + 32;
   System.out.println("It is " + farenheit + " degrees farenheit");
  }
  }