import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
                 
         int ComputerNumber = (int)(Math.random()*100+1);
         
         int UserNumber = -1;
         
         int count = 0;
         
      while (UserNumber != ComputerNumber) {
            System.out.println("Number of Tries: " + count);
            System.out.println("UserNumber a number between 0 and 100");
               UserNumber = reader.nextInt();

         if (UserNumber < 0 || UserNumber > 100) {
            System.out.println("Your input was invalid");
       } else if (UserNumber > ComputerNumber)  {
            System.out.println("To High. The number is lower than " + UserNumber);
               count++;
       } else if (UserNumber < ComputerNumber) {
            System.out.println("To Low. The number is higer than " + UserNumber);
               count++;
       } else if (UserNumber == ComputerNumber)  {
            System.out.println("Correct! The number was " + ComputerNumber);
       } else { 
            System.out.println("Your input was invalid");

            }
         }
         }
}