import java.util.Scanner;

public class InsertionSort {

  // Function to perform insertion sort
  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (isGreater(arr, j, j + 1)) {
          swap(arr, j, j + 1);
        } else {
          break;
        }
      }
    }
  }

  // Used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // Returns true if arr[j] > arr[i]
  public static boolean isGreater(int[] arr, int j, int i) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    return arr[i] < arr[j];
  }

  // Function to print the sorted array
  public static void print(int[] arr) {
    System.out.println("\nSorted array:");
    for (int value : arr) {
      System.out.println(value);
    }
  }

  // Main method to take user input and call the sort
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // Prompt user for input size
    System.out.print("Enter number of elements: ");
    int n = scn.nextInt();

    int[] arr = new int[n];

    // Prompt user to enter array elements
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    // Call insertion sort
    insertionSort(arr);

    // Print sorted array
    print(arr);

    scn.close();
  }
}
