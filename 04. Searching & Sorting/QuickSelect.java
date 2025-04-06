import java.util.Scanner;

public class QuickSelect {

  public static int quickSelect(int[] arr, int lo, int hi, int k) {
    if (lo == hi)
      return arr[lo];

    int pivotIdx = partition(arr, arr[hi], lo, hi);

    if (pivotIdx == k) {
      return arr[pivotIdx];
    } else if (pivotIdx > k) {
      return quickSelect(arr, lo, pivotIdx - 1, k);
    } else {
      return quickSelect(arr, pivotIdx + 1, hi, k);
    }
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("Pivot -> " + pivot);
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

    System.out.println("Pivot index -> " + (j - 1));
    return j - 1;
  }

  // Used for swapping i-th and j-th elements of the array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // For displaying the array (if needed)
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

    System.out.print("Enter k to find k-th smallest element (1-based index): ");
    int k = scn.nextInt();

    if (k < 1 || k > n) {
      System.out.println("Invalid k. Must be between 1 and " + n);
    } else {
      int kthSmallest = quickSelect(arr, 0, arr.length - 1, k - 1);
      System.out.println(k + "-th smallest element is: " + kthSmallest);
    }

    scn.close();
  }
}
