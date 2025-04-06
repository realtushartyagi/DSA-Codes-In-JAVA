import java.util.Scanner;

public class PartitionArray {

  public static void partition(int[] arr, int pivot) {
    int i = 0, j = 0;

    while (i < arr.length) {
      // Partition logic based on pivot
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
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

  // Prints array elements
  public static void print(int[] arr) {
    System.out.println("\nPartitioned Array:");
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
  }

  // Main method for user interaction
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter number of elements in the array: ");
    int n = scn.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter " + n + " array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.print("Enter pivot value: ");
    int pivot = scn.nextInt();

    partition(arr, pivot);
    print(arr);

    scn.close();
  }
}
