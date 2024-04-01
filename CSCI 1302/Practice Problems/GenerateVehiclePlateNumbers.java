/*Cameron  "CJ" Robinson 10/10/23
Page 157 Chapter 4 Problem 4.25
Write a program to generate a plate number
Needs Three UpperCase letters 4 Numbers*/
import java.util.Random;

public class GenerateVehiclePlateNumbers {
    public static void main(String[] args) {
   
Random r = new Random();
   char Letter1 = (char) (r.nextInt(26) + 'A');
   char Letter2 = (char) (r.nextInt(26) + 'A');
   char Letter3 = (char) (r.nextInt(26) + 'A');

   int Number1 = (int)(Math.random() * 10);
   int Number2 = (int)(Math.random() * 10);
   int Number3 = (int)(Math.random() * 10);
   int Number4 = (int)(Math.random() * 10);



System.out.println(Number1 + "" + Letter1 + "" + Number2 + "" + Letter2 + "" + Number3 + "" + Letter3 + "" + Number4);
    }
}
