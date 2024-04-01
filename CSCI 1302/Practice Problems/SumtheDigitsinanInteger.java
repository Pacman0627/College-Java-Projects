/* Cameron "CJ" Robinson 09/19/23
Page 70 Chapter 2 Problem 2.6
Write a program that reads an integer between 0 and 1000
and adds all the digits in the integer*/
import java.util.Scanner;
   public class SumtheDigitsinanInteger {
      public static void main(String[] args) {
         Scanner addition = new Scanner(System.in);
         
   System.out.println("Enter a number between 0 and 1000. ");
      long RandNum = addition.nextLong();
      
      long FirstNum = (int)(RandNum % 10);
      long SecondNum = (int)((RandNum / 10) % 10);
      long ThirdNum = (int)((RandNum / 100) % 10);
      long FourthNum = (int)((RandNum / 1000) % 10);
      
      long Sum = (FirstNum) + (SecondNum) + (ThirdNum) + (FourthNum);

   System.out.println(Sum);
   }
}  
            
            
