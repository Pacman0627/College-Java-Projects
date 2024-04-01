/* Cameron "CJ" Robinson 10/03/23
Write a program which will read an x, y coordinate pair for a geometric point. 
It should output whether the point is at the origin (0, 0), on the x axis [such as (6, 0)], on the y axis [such as (0, -2)], or in one of four quadrants: 
for example: (3, 1) is in quadrant 1, (-2, 2) is in quadrant 2, (-5, -10) is in quadrant 3, and (5, -1) is in quadrant 4.
Due 10/10/23*/

import java.util.Scanner;
   public class robinsoncj4hw4QuadrantFinder {
      public static void main(String[] args) {
         // Create a Scanner object to read input from the user
         Scanner input = new Scanner(System.in);
         
         // User input x-Coord
         System.out.println("Please input the Numerical Value of x Coordiante: ");
            long x = input.nextInt();
            
         // User input y-Coord
         System.out.println("Please input the Numerical Value of y Coordiante: ");
            long y = input.nextInt();
            
         // Checks where the x and y Coordinates are located on a graph  
          if (x == 0 && y == 0) {
            System.out.println("If your Coordinates are (" + x + ", " + y + "), then the point is at the Origin");
        } else if (x == 0) {
            System.out.println("If your Coordinates are (" + x + ", " + y + "), then the point is on the y axis");
        } else if (y == 0) {
            System.out.println("If your Coordinates are (" + x + ", " + y + "), then the point is on the x axis");
        } else if (x > 0 && y > 0) {
            System.out.println("If your Coordinates are (" + x + ", " + y + "), then the point is in Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("If your Coordinates are (" + x + ", " + y + "), then the point is in Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("If your Coordinates are (" + x + ", " + y + "), then the point is in Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("IF your Coordinates are (" + x + ", " + y + "), then the point is in Quadrant 4");
        }
    }
}









