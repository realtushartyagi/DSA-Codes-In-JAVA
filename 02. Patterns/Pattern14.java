import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d * %d = %d", n, i, n * i));
        }
    }
}
