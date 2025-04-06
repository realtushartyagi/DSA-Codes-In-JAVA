import java.util.*;

public class SelectionSort {

  public static void selectionSort(int[] arr) {
    // Perform selection sort
    for (int i = 0; i < arr.length - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (isSmaller(arr, j, minIdx)) {
          minIdx = j;
        }
      }
      swap(arr, i, minIdx);
    }
  }

  // Used for swapping ith and jth elements of array
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

  // Prints the array
  public static void print(int[] arr) {
    for (int value : arr) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = scn.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    selectionSort(arr);

    System.out.println("Sorted array:");
    print(arr);

    scn.close();
  }
}
