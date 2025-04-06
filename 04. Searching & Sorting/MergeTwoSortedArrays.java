import java.util.Scanner;

public class MergeTwoSortedArrays {

  // Merge two sorted arrays into one sorted array
  public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
    int[] res = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        res[k++] = a[i++];
      } else {
        res[k++] = b[j++];
      }
    }

    while (i < a.length) {
      res[k++] = a[i++];
    }

    while (j < b.length) {
      res[k++] = b[j++];
    }

    return res;
  }

  // Print array elements
  public static void print(int[] arr) {
    System.out.println("\nMerged Sorted Array:");
    for (int value : arr) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // Read first array
    System.out.print("Enter number of elements in first sorted array: ");
    int n = scn.nextInt();
    int[] a = new int[n];
    System.out.println("Enter " + n + " sorted elements:");
    for (int i = 0; i < n; i++) {
      a[i] = scn.nextInt();
    }

    // Read second array
    System.out.print("Enter number of elements in second sorted array: ");
    int m = scn.nextInt();
    int[] b = new int[m];
    System.out.println("Enter " + m + " sorted elements:");
    for (int i = 0; i < m; i++) {
      b[i] = scn.nextInt();
    }

    // Merge and print result
    int[] mergedArray = mergeTwoSortedArrays(a, b);
    print(mergedArray);

    scn.close();
  }
}
