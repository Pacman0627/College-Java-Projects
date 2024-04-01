/*Cameron "CJ" Robinson 10/24/23
Write Java code which uses the Babylonian algorithm to find an estimated square root for a number input by the user.
Due 10/31/23*/

import java.util.Scanner;

public class robinsoncj4hw6BablonianMethod {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter the number to find the square root of
        System.out.println("What number are you trying to find the square root of?");
        double S = reader.nextDouble();

        // Calculate the actual square root using Math.sqrt
        double actualSqrt = Math.sqrt(S);

        double x = S / 2; // Initial x for the square root

        if (S < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            // Converge using the Babylonian method
            while (Math.abs((x * x) - S) > 0.0001) {
                x = (x + (S / x)) / 2; // Babylonian algorithm formula
            }

            // Display the estimated square root and the actual square root
            System.out.println("Estimated square root: " + x);
            System.out.println("Actual square root is " + actualSqrt);
        }
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
/*

        // Prompt the user to enter the number to find the square root of
        System.out.println("What number are you trying to find the square root of?");
        double S = reader.nextDouble();

        // Calculate the actual square root using Math.sqrt
        double Sqrt = Math.sqrt(S);

        double x = S / 2;

        // initial estimate for the square root (Forumula found off the internet on a PDF from Auburn.edu)
        double estimate = ((S / x) + x) / 2;
        
        if (S < 0) {
            System.out.println("Please enter a non-negative number.");
        }else{
        // Continue calculation, after each answer set it equal to x and countine running until equal to the square root of inputed number
        while (estimate < .0000000001) {
            estimate = ((S / x) + x) / 2;
            x = estimate;
        }

        // Display the estimated square root and the actual square root
        System.out.println("Estimated square root: " + estimate);
        System.out.println("Actual square root is " + Sqrt);
    }
}

               
               
               }
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               /*double x0 = S / 2;
               double x1 = ((S / x0) + x0) / 2;
               double x2 = ((S / x1) + x1) / 2;
               double x3 = ((S / x2) + x2) / 2;
               double x4 = ((S / x3) + x3) / 2;
               double x5 = ((S / x4) + x4) / 2;
               double x6 = ((S / x5) + x5) / 2;            
               
               
            System.out.println("Estimated square root: " + x2);
            System.out.println("Math.sqrt(S): " + Math.sqrt(S));
   
   
   }
   }

   
 */
  