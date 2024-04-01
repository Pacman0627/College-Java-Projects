import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the number of Students: ");
        int NumStudents = 0;
        if (reader.hasNextInt()) {
            NumStudents = reader.nextInt();
        }

        // Initialize the array's size using user input
        int[] StudentsGrades = new int[NumStudents];

        // Take user elements for the array
        System.out.println("Enter the Students Grades: ");
        for (int i = 0; i < NumStudents; i++) {
            while (!reader.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer: ");
                reader.next(); // Consume the invalid input
            }
            StudentsGrades[i] = reader.nextInt();
        }

        // Find and print the HighestGrade grade
        int HighestGrade = findMaxGrade(StudentsGrades);
        System.out.println("If the highest grade is: " + HighestGrade);

        // Print letter grades for each student
        System.out.println("Letter grades for each student: ");
        for (int i = 0; i < NumStudents; i++) {
            char letterGrade = getLetterGrade(StudentsGrades[i], HighestGrade);
            System.out.println("Student " + (i + 1) + " got a grade of " + StudentsGrades[i] + " and a letter grade of " + letterGrade);
        }

        reader.close();
    }

    // Method to find the grade in the array
    public static int findMaxGrade(int[] arr) {
        int HighestGrade = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > HighestGrade)
                HighestGrade = arr[i];
        return HighestGrade;
    }

    // Method to convert numeric grade to letter grade
    public static char getLetterGrade(int numericGrade, int HighestGrade) {
        if (numericGrade >= HighestGrade - 10) {
            return 'A';
        } else if (numericGrade >= HighestGrade - 20) {
            return 'B';
        } else if (numericGrade >= HighestGrade - 30) {
            return 'C';
        } else if (numericGrade >= HighestGrade - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
