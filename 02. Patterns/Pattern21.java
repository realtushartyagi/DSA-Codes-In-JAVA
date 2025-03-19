import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close(); // Closing the scanner to prevent memory leaks

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { // Print i stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing stars
        }
    }
}
