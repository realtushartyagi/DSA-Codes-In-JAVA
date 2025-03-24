import java.util.Scanner;

public class Bar_Chart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]); // Finding max in the same loop
        }

        System.out.println("Bar Chart:");
        for (int i = max; i > 0; i--) {
            for (int val : arr) {
                System.out.print(val >= i ? "* " : "  ");
            }
            System.out.println();
        }

        scn.close();
    }
}
