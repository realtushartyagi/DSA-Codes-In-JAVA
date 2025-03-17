import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number: "); // Prompt message for user input
        int n = sc.nextInt();
        sc.close(); // Closing scanner to avoid memory leak

        int stars = 1, spaces = n / 2;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");

            // Print stars with hollow spaces
            for (int j = 1; j <= stars; j++) {
                if (i == n / 2 + 1 || j == 1 || j == stars) // Full middle row & edges
                    System.out.print("* ");
                else
                    System.out.print("  "); // Hollow spaces
            }

            System.out.println();

            // Update stars and spaces for next row
            if (i < n / 2 + 1) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }
    }
}
