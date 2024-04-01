import java.util.Scanner;

public class SSNChecker {
    public static void main (String [] args)    {

        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a Social Security Number (SSN) with dashes: ");
         String SSN = reader.nextLine();
         
         if (SSN.length() == 11)  {
            System.out.print(SSN + " is a vaild Social Security Number.");
         }  else  {
               System.out.print(SSN + " is not a vaild Social Security Number.");
}
}
}