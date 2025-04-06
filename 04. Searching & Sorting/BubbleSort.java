import java.util.Scanner;

public class BubbleSort {

    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (isSmaller(arr, j + 1, j)) {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    // Swaps the ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Returns true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        return arr[i] < arr[j];
    }

    // Prints the array elements
    public static void print(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    // Main method to take input and trigger sorting
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking size of array input
        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Sorting the array
        bubbleSort(arr);

        // Displaying the sorted array
        System.out.println("Sorted array:");
        print(arr);

        scn.close();
    }
}
