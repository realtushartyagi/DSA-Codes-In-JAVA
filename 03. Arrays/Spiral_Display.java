import java.util.*;

public class Spiral_Display {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input for rows and columns
        System.out.print("Enter number of rows: ");
        int n = scn.nextInt();
        System.out.print("Enter number of columns: ");
        int m = scn.nextInt();

        // Edge case: If n or m is zero, return
        if (n <= 0 || m <= 0) {
            System.out.println("Invalid input. Number of rows and columns must be greater than 0.");
            scn.close();
            return;
        }

        int[][] arr = new int[n][m];

        // Taking user input for matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // Spiral traversal variables
        int frow = 0, lrow = n - 1, fcol = 0, lcol = m - 1;
        int counter = 0, total = n * m;

        System.out.println("Spiral order traversal of the matrix:");
        while (counter < total) {
            // Traverse left wall (top to bottom)
            for (int i = frow; i <= lrow && counter < total; i++) {
                System.out.println(arr[i][fcol]);
                counter++;
            }
            fcol++; // Move right

            // Traverse bottom wall (left to right)
            for (int j = fcol; j <= lcol && counter < total; j++) {
                System.out.println(arr[lrow][j]);
                counter++;
            }
            lrow--; // Move up

            // Traverse right wall (bottom to top)
            for (int i = lrow; i >= frow && counter < total; i--) {
                System.out.println(arr[i][lcol]);
                counter++;
            }
            lcol--; // Move left

            // Traverse top wall (right to left)
            for (int j = lcol; j >= fcol && counter < total; j--) {
                System.out.println(arr[frow][j]);
                counter++;
            }
            frow++; // Move down
        }

        scn.close();
    }
}
