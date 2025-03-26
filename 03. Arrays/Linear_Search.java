import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt(), arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.print("Enter the number to search: ");
        int d = scn.nextInt(), ans = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == d) {
                ans = i;
                break;
            }
        }

        System.out.println("Element found at index: " + ans);
        scn.close();
    }
}
