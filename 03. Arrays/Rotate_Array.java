import java.util.*;

public class Rotate_Array {

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = ((k % n) + n) % n; // Handle negative rotations

        reverse(a, 0, n - k - 1); // Reverse first n-k elements
        reverse(a, n - k, n - 1); // Reverse last k elements
        reverse(a, 0, n - 1); // Reverse whole array
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scn.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int k = scn.nextInt();

        rotate(a, k);

        System.out.println("Rotated Array:");
        display(a);

        scn.close();
    }
}
