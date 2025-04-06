import java.util.*;

public class QuickSort {

  public static void quickSort(int[] arr, int left, int right) {
    if (left >= right)
      return; // Corrected base case

    int pivotIdx = partition(arr, arr[right], left, right);
    quickSort(arr, left, pivotIdx - 1);
    quickSort(arr, pivotIdx + 1, right);
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;

    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }

    System.out.println("pivot index -> " + (j - 1));
    return j - 1;
  }

  // Used for swapping i-th and j-th elements of the array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // Print the sorted array
  public static void print(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter number of elements in array: ");
    int n = scn.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter " + n + " array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    quickSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array:");
    print(arr);

    scn.close();
  }
}
