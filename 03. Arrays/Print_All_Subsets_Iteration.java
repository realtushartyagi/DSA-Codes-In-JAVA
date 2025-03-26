import java.util.*;

public class Print_All_Subsets_Iteration {

    // Function to print all subsets
    public static void printSubsets(int[] a, int n) {
        int totalSubsets = (1 << n); // 2^n using bitwise shift
        for (int dec = 0; dec < totalSubsets; dec++) {
            for (int i = 0; i < n; i++) {
                if ((dec & (1 << i)) == 0)
                    System.out.print("- ");
                else
                    System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        System.out.println("All subsets:");
        printSubsets(a, n);
        scn.close();
    }
}
