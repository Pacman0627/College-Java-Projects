import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] ListofNumbers = {8, 6, 11, 17, 3, 15, 5, 19, 28, 12};
        System.out.println("Original array: " + Arrays.toString(ListofNumbers));

        // Sorting logic
        for (int i = 0; i < ListofNumbers.length; i++) {
            for (int j = i + 1; j < ListofNumbers.length; j++) {
                int Temp = 0;
                if (ListofNumbers[i] > ListofNumbers[j]) {
                    Temp = ListofNumbers[i];
                    ListofNumbers[i] = ListofNumbers[j];
                    ListofNumbers[j] = Temp;
                }
            }
        }

        // Prints the sorted array
        System.out.print("Sorted array: " + Arrays.toString(ListofNumbers));
    }
}
