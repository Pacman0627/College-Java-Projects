/*Cameron "CJ" Robinson 10/26/23
Page 195 Chapter 5 Problem 5.7
Write a program that displays the tuition in 10 years, 
and the total cost after 4 years.
Suppose tuition starts at $10000 and increase 5% every year*/
import java.util.Scanner;

public class FinancialApplicationcomputeFutureTuition {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double CostAfter4Years = 0;
        double tuition = 10000;                  
        int count = 0;
                
        while (count < 10) { 
            double nextYearsTuition = tuition * 1.05;             
            tuition = nextYearsTuition;
            count++;
            
             if (count == 4) {
                CostAfter4Years = tuition;
        }
}
        System.out.println("Tuition after 10 years: " + tuition); 
        System.out.println("The Total Cost of Tuition after 4 years: " + CostAfter4Years);
    }
}
