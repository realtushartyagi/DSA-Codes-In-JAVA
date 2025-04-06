import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    int max = Integer.MIN_VALUE;

    // Find the maximum value in array
    for (int value : arr) {
      if (max < value)
        max = value;
    }

    // Perform counting sort for every digit (exp = 1, 10, 100, ...)
    for (int exp = 1; exp <= max; exp *= 10) {
      countSort(arr, exp);
    }
  }

  public static void countSort(int[] arr, int exp) {
    int[] freq = new int[10];

    // Frequency array based on digit at exp place
    for (int j : arr) {
      int dig = (j / exp) % 10;
      freq[dig]++;
    }

    // Prefix sum (cumulative frequency array)
    for (int i = 1; i < freq.length; i++) {
      freq[i] += freq[i - 1];
    }

    // Stable sort
    int[] ans = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      int idx = (arr[i] / exp) % 10;
      int pos = freq[idx] - 1;
      ans[pos] = arr[i];
      freq[idx]--;
    }

    // Copy back to original array
    System.arraycopy(ans, 0, arr, 0, arr.length);

    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

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

    radixSort(arr);

    System.out.print("Sorted array: ");
    print(arr);

    scn.close();
  }
}
