import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int n = scn.nextInt();
        scn.close();

        int stars = n, spaces = 0;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");

            // Print stars with hollow spaces
            for (int j = 1; j <= stars; j++) {
                if (i == 1 || i == n || j == 1 || j == stars) // First row, last row, or edges
                    System.out.print("* ");
                else
                    System.out.print("  "); // Hollow space
            }

            System.out.println();

            // Update stars and spaces
            if (i < n / 2 + 1) { // Upper half
                spaces++;
                stars -= 2;
            } else { // Lower half
                spaces--;
                stars += 2;
            }
        }
    }
}
