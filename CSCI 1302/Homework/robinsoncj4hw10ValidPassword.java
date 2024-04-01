/* Cameron "CJ" Robinson 11/27/23
   Write a method that takes a String as a parameter, and returns a boolean 
   indicating whether or not the string is a legal username based on the users in the file.
   Write a main() method that prompts the user for a username and lets them know whether or not they are allowed to use the program.
   Due 12/05/23 */
import java.util.Scanner;

public class robinsoncj4hw10ValidPassword {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Get user preferences for password requirements
        System.out.println("How long should passwords be? (0 means any length)");
        int minimumLength = reader.nextInt();

        System.out.println("Should passwords have both upper and lower case?   1). Yes 2). No ");
        int needUpAndLowCase = reader.nextInt();

        // Validate the input for having both upper and lower case
        if (needUpAndLowCase != 1 && needUpAndLowCase != 2) {
            System.out.println("Please enter 1 or 2");
        } else {
            System.out.println("Should passwords contain at least one digit or symbol?   1). Yes 2). No ");
            int needOneDigitOrSymbol = reader.nextInt();

            // Validate the input for having at least one digit or symbol
            if (needOneDigitOrSymbol != 1 && needOneDigitOrSymbol != 2) {
                System.out.println("Please enter 1 or 2");
            } else {
                System.out.println("Should passwords contain digits and symbols? 1). Yes 2). No");
                int needDigitsAndSymbols = reader.nextInt();

                // Validate the input for having both digits and symbols
                if (needDigitsAndSymbols != 1 && needDigitsAndSymbols != 2) {
                    System.out.println("Please enter 1 or 2");
                } else {
                    // Get user input for the password
                    System.out.println("Enter your Password");
                    String userPassword = reader.next();

                    // Print the result of password validation
                    System.out.println(isValidPassword(userPassword, minimumLength, needUpAndLowCase, needOneDigitOrSymbol, needDigitsAndSymbols));
                }
            }
        }
    }

    /*
     Checks the validity of a password based on user preferences.
     userPassword - Is the password entered by the user.
     minimumLength - Sets the minimum length required for the password.
     needUpAndLowCase - Checks the users preference for having both upper and lower case.
     needOneDigitOrSymbol - Checks the users preference for having at least one digit or symbol.
     needDigitsAndSymbols - Checks the users preference for having both digits and symbols.
     returns True if the password is valid, false otherwise.
     */
     
    public static boolean isValidPassword(String userPassword, int minimumLength, int needUpAndLowCase, int needOneDigitOrSymbol, int needDigitsAndSymbols) {
        boolean isMinimumLength = userPassword.length() >= minimumLength;

        // Check user preferences for password requirements and return the result
         if (needUpAndLowCase == 1) {
            return containsUppercase(userPassword) && containsLowercase(userPassword);
        } else if (needOneDigitOrSymbol == 1) {
            return containsNumber(userPassword) || containsSpecialCharacter(userPassword);
        } else if (needDigitsAndSymbols == 1) {
            return containsNumber(userPassword) && containsSpecialCharacter(userPassword);
        }

        return false;  // Return false by default
    }

  // Checks if the password contains at least one special character.
     
    public static boolean containsSpecialCharacter(String userPassword) {
        for (int i = 0; i < userPassword.length(); i++) {
            int asciiVal = (int) userPassword.charAt(i);
            if ((asciiVal >= 32 && asciiVal <= 47) || (asciiVal >= 58 && asciiVal <= 64)
                    || (asciiVal >= 91 && asciiVal <= 96) || (asciiVal >= 123 && asciiVal <= 126)) {
                return true;  // Return true if a special character is found
            }
        }
        return false;  // Return false if no special character is found
    }

  // Checks if the password contains at least one digit
     
    public static boolean containsNumber(String userPassword) {
        for (int j = 0; j < userPassword.length(); j++) {
            if (Character.isDigit(userPassword.charAt(j))) {
                return true;  // Return true if a number is found
            }
        }
        return false;  // Return false if no number is found
    }

  // Checks if the password contains at least one lowercase letter.
  
    public static boolean containsLowercase(String userPassword) {
        for (int k = 0; k < userPassword.length(); k++) {
            if (Character.isLowerCase(userPassword.charAt(k))) {
                return true;  // Return true if a lowercase letter is found
            }
        }
        return false;  // Return false if no lowercase letter is found
    }

    // Checks if the password contains at least one uppercase letter.
    
    public static boolean containsUppercase(String userPassword) {
        for (int l = 0; l < userPassword.length(); l++) {
            if (Character.isUpperCase(userPassword.charAt(l))) {
                return true;  // Return true if an uppercase letter is found
            }
        }
        return false;  // Return false if no uppercase letter is found
    }
}
