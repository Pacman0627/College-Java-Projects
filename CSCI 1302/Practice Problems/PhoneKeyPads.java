/*Cameron "CJ" Robinson 10/17/23
Page 155 Chapter 4 Problem 4.15
Write a program that prompts the user the enter a letter
and displays its corresponding number according to the 
international standard letter/number mapping found on telephones*/

import java.util.Scanner;

public class PhoneKeyPads {
    public static void main (String [] args)    {

        Scanner reader = new Scanner(System.in);
        
        boolean vaildLetter = false;

  while (!vaildLetter) {      
        System.out.print(" Enter a Letter: ");
           char Letter = reader.nextLine().toLowerCase().charAt(0);
                        
         if (Letter == 'a' || Letter == 'b' || Letter == 'c')  {
            System.out.print("The Corresponding number is 2.") ;
             vaildLetter = true;
    }   else if (Letter == 'd' || Letter == 'e' || Letter == 'f')  {
            System.out.print("The Corresponding number is 3.");
             vaildLetter = true;
    }   else if (Letter == 'g' || Letter == 'h' || Letter == 'i')  {
            System.out.print("The Corresponding number is 4.");
             vaildLetter = true;
    }   else if (Letter == 'j' || Letter == 'k' || Letter == 'l')  {
            System.out.print("The Corresponding number is 5.");
             vaildLetter = true;
    }   else if (Letter == 'm' || Letter == 'n' || Letter == 'o')  {
            System.out.print("The Corresponding number is 6.");
             vaildLetter = true;
    }   else if (Letter == 'p' || Letter == 'q' || Letter == 'r' || Letter == 's' )  {
            System.out.print("The Corresponding number is 7.");
             vaildLetter = true;
    }   else if (Letter == 't' || Letter == 'u' || Letter == 'v')  {
            System.out.print("The Corresponding number is 8.");
             vaildLetter = true;
    }   else if (Letter == 'w' || Letter == 'x' || Letter == 'y' || Letter == 'z' )  {
            System.out.print("The Corresponding number is 9.");
             vaildLetter = true;
    }   else   {
            System.out.print("Invalid Input.");
    }
        }
         }
         }