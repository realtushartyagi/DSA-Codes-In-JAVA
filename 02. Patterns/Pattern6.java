import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter an odd number of rows: ");
        int n = scn.nextInt();
        scn.close();

        int spaces = 1, stars = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            // Print first set of stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            // Print second set of stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            // Move to the next line
            System.out.println();

            // Adjust stars and spaces for next row
            if (i < n / 2 + 1) { // Upper half including middle row
                stars--;
                spaces += 2;
            } else { // Lower half
                stars++;
                spaces -= 2;
            }
        }
    }
}
