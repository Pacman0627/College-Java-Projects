//Always Start Program off with
public class FileName {
    public static void main(String[] args) {
    }
}

//Tells the compiler, that any time you use a Scanner, you mean the one which is located in java.util
   import java.util.Scanner;

//Makes a new "Scanner storees it in the variable input
   Scanner input = new Scanner(System.in);
   
// Stores whatever the user inputed into variable, can use int, double, long
   int variable = input.nextInt();

   
   if (condition) {
    // executed only if "condition" is true
}  else if (other condition)  {
    // executed only if "condition" was false and "other condition" is true
}  else  {
    // executed only if both "condition" and "other condition" were false
}

//executes one statement from multiple conditions. 
switch(condition)   {
   // If condition matches a case value output the Statement
   case value1 : /* Statements */ break;   
   case value2 : /* Statements */ break;   
}