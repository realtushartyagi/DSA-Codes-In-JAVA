import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "\t"); // Using tab for uniform spacing

                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
