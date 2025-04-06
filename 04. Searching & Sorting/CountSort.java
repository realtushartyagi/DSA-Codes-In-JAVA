import java.util.Scanner;

public class CountSort {

  // Function to perform Counting Sort
  public static void countSort(int[] arr, int min, int max) {
    // Step 1: Create frequency array
    int[] freq = new int[max - min + 1];
    for (int value : arr) {
      int idx = value - min;
      freq[idx]++;
    }

    // Step 2: Build prefix sum array
    int[] prefixSum = new int[freq.length];
    for (int i = 0; i < freq.length; i++) {
      prefixSum[i] = (i == 0) ? freq[i] : prefixSum[i - 1] + freq[i];
    }

    // Step 3: Build sorted answer array using prefix sums (stable sort)
    int[] ans = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      int idx = arr[i] - min;
      int pos = prefixSum[idx] - 1;
      ans[pos] = arr[i];
      prefixSum[idx]--;
    }

    // Step 4: Copy sorted elements back to original array
    System.arraycopy(ans, 0, arr, 0, arr.length);
  }

  // Function to print the array
  public static void print(int[] arr) {
    System.out.println("Sorted array:");
    for (int value : arr) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // Ask user for number of elements
    System.out.print("Enter number of elements: ");
    int n = scn.nextInt();

    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    // Take array input from user
    System.out.println("Enter " + n + " integers:");
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }

    // Perform counting sort
    countSort(arr, min, max);

    // Display sorted array
    print(arr);

    scn.close();
  }
}
