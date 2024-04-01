/*Cameron "CJ" Robinson 10/11/23
Page 154 Chapter 4 Problem 4.13
Write a program that prompts the user the enter a letter
and check whether the letter is a vowel or constant.
non letters are invalid*/

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        
        
       System.out.print("Enter a Letter: ");
        char Letter = checker.nextLine().charAt(0);
        
        if (Letter == 'y') {
         System.out.println(Letter + " is sometimes a constant, and sometimes a vowl");
        } else if (Letter == 'a' || Letter == 'e' || Letter == 'i' || Letter == 'o' || Letter == 'u') {
            System.out.println(Letter + " is a vowel");           
             } else if ((Letter >= 'a' && Letter <= 'z')) {
            System.out.println(Letter + " is a consonant");
        } else {
            System.out.println(Letter + " is not a valid Letter.");
        }         }
         }
         
        
        
