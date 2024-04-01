/*Cameron "CJ" Robinson 10/17/23
Page 156 Chapter 4 Problem 4.22
Write a program that prompts the user to enter two strings,
and reports whether the second strintg is a substring of the first.*/
import java.util.Scanner;

public class CheckSubstring {
    public static void main (String [] args)    {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a String of Letters. ");
        String letters = reader.nextLine();
        System.out.println("Enter another String of Letters. ");
        String letters2 = reader.nextLine();

        if(letters.contains(letters2)) {
            System.out.println(letters2 + " is a substring of " + letters);
        } else  {
            System.out.println(letters2 + " is not a substring of " + letters);
        }
    }
}