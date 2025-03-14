import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number of rows: ");
        int n = sc.nextInt();
        sc.close(); // Closing the scanner after input

        int spaces = n / 2; // Initial spaces
        int stars = 1; // Initial number of stars

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();

            // Adjust spaces and stars for next row
            if (i < n / 2 + 1) { // Upper half including middle row
                spaces--;
                stars += 2;
            } else { // Lower half
                spaces++;
                stars -= 2;
            }
        }
    }
}
