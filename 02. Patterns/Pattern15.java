import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();
        sc.close();

        int stars = 1, spaces = n / 2, val = 1;

        for (int i = 1; i <= n; i++) {
            int temp = val;

            for (int j = 1; j <= spaces; j++)
                System.out.print("\t");

            for (int j = 1; j <= stars; j++) {
                System.out.print(temp + "\t");
                temp = (j < stars / 2 + 1) ? temp + 1 : temp - 1;
            }

            System.out.println();

            if (i <= n / 2) {
                stars += 2;
                spaces--;
                val++;
            } else {
                stars -= 2;
                spaces++;
                val--;
            }
        }
    }
}
