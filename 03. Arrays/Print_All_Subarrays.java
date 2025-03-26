import java.util.*;

public class Print_All_Subarrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        System.out.println("All subarrays:");
        for (int st = 0; st < n; st++) {
            for (int end = st; end < n; end++) {
                for (int i = st; i <= end; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}
