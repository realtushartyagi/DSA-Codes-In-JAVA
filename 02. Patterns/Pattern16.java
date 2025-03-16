import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int spaces = 2 * n - 3, stars = 1;

        for (int i = 1; i <= n; i++) {
            int val = 1;

            for (int j = 1; j <= stars; j++) {
                System.out.print(val + "\t");
                val++;
            }

            for (int j = 1; j <= spaces; j++)
                System.out.print("\t");

            if (i == n)
                stars--;
            val = stars;
            for (int j = 1; j <= stars; j++) {
                System.out.print(val + "\t");
                val--;
            }

            System.out.println();
            stars++;
            spaces -= 2;
        }
    }
}
