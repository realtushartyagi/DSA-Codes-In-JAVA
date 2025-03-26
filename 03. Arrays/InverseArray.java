import java.util.*;

public class InverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scn.nextInt(), a[] = new int[n], inv[] = new int[n];

        System.out.println("Enter array elements (0 to " + (n - 1) + " without duplicates):");
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        // Compute inverse
        for (int i = 0; i < n; i++)
            inv[a[i]] = i;

        System.out.println("Inversed array:");
        for (int val : inv)
            System.out.println(val);

        scn.close();
    }
}
