import java.util.*;

public class Saddle_Price {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input for matrix size
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        // Taking user input for matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        boolean isSaddlePtAchieved = false;

        for (int i = 0; i < n; i++) {
            // Finding the minimum element in row i
            int min = Integer.MAX_VALUE;
            int col = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    col = j;
                }
            }

            // Finding the maximum element in column `col`
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < n; k++) {
                if (arr[k][col] > max) {
                    max = arr[k][col];
                }
            }

            // Checking if the min element in row is also the max in its column
            if (min == max) {
                System.out.println("Saddle point: " + min);
                isSaddlePtAchieved = true;
                break;
            }
        }

        if (!isSaddlePtAchieved) {
            System.out.println("Invalid input - No saddle point found.");
        }

        scn.close();
    }
}
