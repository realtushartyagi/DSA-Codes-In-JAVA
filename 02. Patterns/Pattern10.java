import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number for the pattern size: ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int stars = 1, spaces = n / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

            if (i <= n / 2) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }
    }
}
