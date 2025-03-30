import java.util.*;

public class Reverse_Array {

    // Function to display array elements
    public static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Function to reverse the array
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        // Reverse the array
        reverse(a);

        // Display the reversed array
        System.out.println("Reversed array:");
        display(a);

        scn.close();
    }
}
