import java.util.*;

public class Ring_Rotate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int n = scn.nextInt();
        System.out.print("Enter number of columns: ");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // Input shell number and rotation count
        System.out.print("Enter shell number: ");
        int s = scn.nextInt();
        System.out.print("Enter number of rotations: ");
        int r = scn.nextInt();

        // Perform the shell rotation
        int[] oneD = getShell(arr, s);
        rotate(oneD, r);
        fillShell(arr, oneD, s);

        // Display the rotated matrix
        System.out.println("Rotated Matrix:");
        display(arr);

        scn.close();
    }

    public static int[] getShell(int[][] arr, int s) {
        int n = arr.length, m = arr[0].length;
        int frow = s - 1, fcol = s - 1;
        int lrow = n - s, lcol = m - s;
        int size = 2 * (lcol - fcol) + 2 * (lrow - frow);

        int[] oneD = new int[size];
        int counter = 0;

        // Left wall
        for (int i = frow; i <= lrow; i++) {
            oneD[counter++] = arr[i][fcol];
        }
        fcol++;

        // Bottom wall
        for (int j = fcol; j <= lcol; j++) {
            oneD[counter++] = arr[lrow][j];
        }
        lrow--;

        // Right wall
        for (int i = lrow; i >= frow; i--) {
            oneD[counter++] = arr[i][lcol];
        }
        lcol--;

        // Top wall
        for (int j = lcol; j >= fcol; j--) {
            oneD[counter++] = arr[frow][j];
        }

        return oneD;
    }

    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = ((k % n) + n) % n; // Handle negative rotations
        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void fillShell(int[][] arr, int[] oneD, int s) {
        int n = arr.length, m = arr[0].length;
        int frow = s - 1, fcol = s - 1;
        int lrow = n - s, lcol = m - s;
        int counter = 0;

        // Left wall
        for (int i = frow; i <= lrow; i++) {
            arr[i][fcol] = oneD[counter++];
        }
        fcol++;

        // Bottom wall
        for (int j = fcol; j <= lcol; j++) {
            arr[lrow][j] = oneD[counter++];
        }
        lrow--;

        // Right wall
        for (int i = lrow; i >= frow; i--) {
            arr[i][lcol] = oneD[counter++];
        }
        lcol--;

        // Top wall
        for (int j = lcol; j >= fcol; j--) {
            arr[frow][j] = oneD[counter++];
        }
    }

    public static void display(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
