/*Cameron "CJ" Robinson 10/31/23
Write a Java program that will read the attached file and find / print the largest number (note that all of the numbers in the file are positive).
Due 11/07/23*/

import java.util.Scanner;

public class robinsoncj4hw7LargestNumberFromFile {
    public static void main(String[] args) throws Exception {
        // Creating a File object to reference the "numbers.txt" file
        java.io.File file = new java.io.File("numbers.txt");
        
        // Creating a Scanner object to read from the file
        Scanner input = new Scanner(file);
        
        // Initializing a variable to store the largest number found in the file
        double LargestNumber = 0;
        
        // Looping through the file content until there are more elements to read
        while (input.hasNext()) {
            // Reading the next integer from the file
            double FileNumber = input.nextDouble();
            
            // Checking if the newly read number is greater than the current 'num'
            // If so, updating 'num' to the newly read number
            if (FileNumber > LargestNumber) {
                LargestNumber = FileNumber;
            }
        }
        
        // Printing the largest number found in the file
        System.out.println("The Largest Number in the file is: " + LargestNumber);
        
        // Closing the Scanner to release system resources
        input.close(); // It's a good practice 
        }
}
