import java.util.*;

public class Span_Of_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        
        // Edge case: If the user enters a non-positive number
        if (n <= 0) {
            System.out.println("Invalid input. Array size must be greater than 0.");
            scn.close();
            return;
        }

        int[] arr = new int[n];

        // Taking user input for array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Finding min and max in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int span = max - min;
        System.out.println("Span of the array: " + span);

        scn.close();
    }
}
