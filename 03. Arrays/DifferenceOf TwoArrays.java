import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input for the first array
        System.out.print("Enter size of first array: ");
        int n1 = scn.nextInt(), arr1[] = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++)
            arr1[i] = scn.nextInt();

        // Taking input for the second array
        System.out.print("Enter size of second array: ");
        int n2 = scn.nextInt(), arr2[] = new int[n2], arr3[] = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++)
            arr2[i] = scn.nextInt();

        // Subtracting arrays
        int i1 = n1 - 1, i2 = n2 - 1, borrow = 0;
        for (int i3 = n2 - 1; i3 >= 0; i3--) {
            int diff = arr2[i2--] - borrow - (i1 >= 0 ? arr1[i1--] : 0);
            arr3[i3] = diff < 0 ? (diff + 10) : diff;
            borrow = diff < 0 ? 1 : 0;
        }

        // Skipping leading zeros
        int i = 0;
        while (i < n2 && arr3[i] == 0)
            i++;

        // Printing result
        System.out.println("Difference of the two arrays:");
        while (i < n2)
            System.out.println(arr3[i++]);

        scn.close();
    }
}
