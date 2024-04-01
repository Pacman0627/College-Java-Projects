/* Cameron "CJ" Robinson 10/31/23
   Write a method that takes a String as a parameter, and returns a boolean 
   indicating whether or not the string is a legal username based on the users in the file.
   Write a main() method that prompts the user for a username and lets them know whether or not they are allowed to use the program.
   Due 11/14/23 */

import java.util.Scanner;

public class robinsoncj4hw8ValidUsername {
    public static void main(String[] args) throws Exception {
    
        // Create a new scanner named reader to read user's input from the console
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter a username --- takes the thing inputed into the console and changes it into all lower case and store it into the Variable inputedUsername
        System.out.print("Enter a username to check if it's valid: ");
        String inputedUsername = reader.nextLine().toLowerCase();

        // Check if the entered username is valid and print the result --- calls upon the checkUsername method and prints the result stored in inputedUsername
        System.out.println("Is the username " + "'" + inputedUsername + "'" + " valid? " + checkUsername(inputedUsername));
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    // Method to check the validity of the entered username --- brings the String (inputedUsername) in the main method into the checkUsename method 
    public static boolean checkUsername(String inputedUsername) throws Exception {
    
        // Read the list of usernames from a file named "users.txt"
        java.io.File file = new java.io.File("users.txt");

        // Create a new scanner named input to read the "users.txt" file
        Scanner input = new Scanner(file);
        
        // Creates a T/F variable name isUsernameValid --- sets it to false 
        boolean isUsernameValid = false;
        
        // Creates a whiile loop --- Statement: Using the scanner named input to see if something is contained on the next line
        while (input.hasNext()) {
            String name = input.nextLine();

            // Checks Variable inputedUsername to see if its equal/the same as Variable name 
            if (inputedUsername.equals(name)) {
            
                // If the username entered equals a username in the file --- set isUsernameValid to True
                isUsernameValid = true;
                
                break; // Stop the loop after a match is found
            }
        }
        // Close the scanner to release resources
        input.close();
        return isUsernameValid;
    }
}
