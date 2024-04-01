/*Cameron "CJ" Robinson 11/02/23
Page 154 Chapter 4 Problem 4.16
Generate a random Uppercase Letter*/
import java.util.Random;

public class RandomCharacter {
    public static void main(String[] args) {
    
  Random r = new Random();
   char Letter1 = (char) (r.nextInt(26) + 'A');
   
   System.out.println(Letter1 + "");
    }
}

