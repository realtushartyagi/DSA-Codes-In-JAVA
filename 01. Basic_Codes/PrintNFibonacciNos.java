import java.util.Scanner;

public class PrintNFibonacciNos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: "); // Input prompt
        int n = scn.nextInt();
        scn.close(); // Close scanner after input

        int a = 0, b = 1; // Initialize first two Fibonacci numbers

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next = a + b; // Calculate next term
            a = b;
            b = next;
        }
    }
}
