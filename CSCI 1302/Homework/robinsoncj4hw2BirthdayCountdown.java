/* Cameron Robinson "CJ" 09/12/2023
Write a Java program that will input from the user
the number of years, days, hours, minutes, and seconds until a particular event will occur. 
The program will output the total number of seconds that must pass for that event.
Due 09/19/2023*/

import java.util.Scanner;
   public class robinsoncj4hw2BirthdayCountdown {
      public static void main(String [] args){
         Scanner reader = new Scanner(System.in);
   
   System.out.println("How many years until your birthday? ");
 	     int Years = reader.nextInt();
   System.out.println("How many months until your birthday? ");
       int Months = reader.nextInt(); 
 	 System.out.println("How many days until your birthday? ");
 	     int Days = reader.nextInt();
   System.out.println("How many hours until your birthday? ");
 	     int Hours = reader.nextInt();
   System.out.println("How many minutes until your birthday? ");
 	     int Minutes = reader.nextInt(); 
   System.out.println("How many seconds until your birthday? ");
 	     int Seconds = reader.nextInt();

// Conversion of Years, Days, Hours, Minutes to seconds found on Google.com 
       int Countdown = (Years*31536000)+(Months*2628000)+(Days*86400)+(Hours*3600)+(Minutes*60)+(Seconds*1);

   System.out.println(Countdown + " Seconds till your Birthday!!");
  }
}