import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        int spaces = 0, stars = n;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            System.out.println();

            spaces++;
            stars--;
        }
    }
}
