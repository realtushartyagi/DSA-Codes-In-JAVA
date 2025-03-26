import java.util.*;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input for first matrix
        System.out.print("Enter rows and columns for first matrix: ");
        int n1 = scn.nextInt(), m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m1; j++)
                arr1[i][j] = scn.nextInt();

        // Input for second matrix
        System.out.print("Enter rows and columns for second matrix: ");
        int n2 = scn.nextInt(), m2 = scn.nextInt();
        int[][] arr2 = new int[n2][m2];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n2; i++)
            for (int j = 0; j < m2; j++)
                arr2[i][j] = scn.nextInt();

        // Check if multiplication is possible
        if (m1 != n2) {
            System.out.println("Invalid input");
        } else {
            // Multiplication Logic
            int[][] res = new int[n1][m2];
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m1; k++) {
                        res[i][j] += arr1[i][k] * arr2[k][j];
                    }
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        scn.close();
    }
}
