import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int a = scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();

        scn.close(); // Close scanner

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Printing swapped values
        System.out.println("After Swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}
