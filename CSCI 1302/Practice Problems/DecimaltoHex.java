/*Cameron  "CJ" Robinson 10/10/23
Page 153 Chapter 4 Problem 4.11
Write a program that prompts the user to enter an interger between 0 and 15
and displays its corresponding Hex Number*/

import java.util.Scanner;

public class DecimaltoHex {
    public static void main(String[] args) {
        Scanner converter = new Scanner(System.in);
        
        System.out.println("Enter a decimal value (0 to 15): ");
        int number = converter.nextInt();
 
        if (number < 0 || number > 15) {
         System.out.println("Invalid Input. Please enter a number between 0 and 15");
        } else {
         switch (number) {
            case 0: System.out.println("The Hex Value is ... 0"); break;
            case 1: System.out.println("The Hex Value is ... 1"); break;
            case 2: System.out.println("The Hex Value is ... 2"); break;
            case 3: System.out.println("The Hex Value is ... 3"); break;
            case 4: System.out.println("The Hex Value is ... 4"); break;
            case 5: System.out.println("The Hex Value is ... 5"); break;
            case 6: System.out.println("The Hex Value is ... 6"); break;
            case 7: System.out.println("The Hex Value is ... 7"); break;
            case 8: System.out.println("The Hex Value is ... 8"); break;
            case 9: System.out.println("The Hex Value is ... 9"); break;
            case 10: System.out.println("The Hex Value is ... A"); break;
            case 11: System.out.println("The Hex Value is ... B"); break;
            case 12: System.out.println("The Hex Value is ... C"); break;
            case 13: System.out.println("The Hex Value is ... D"); break;
            case 14: System.out.println("The Hex Value is ... E"); break;
            case 15: System.out.println("The Hex Value is ... F"); break;
           
}
}
}
}