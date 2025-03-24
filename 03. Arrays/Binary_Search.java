import java.util.Scanner;

public class Binary_Search {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid; // Found target
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.print("Enter target element: ");
        int target = scn.nextInt();

        int result = binarySearch(arr, target);
        System.out.println(result == -1 ? "Element not found" : "Element found at index " + result);

        scn.close();
    }
}
