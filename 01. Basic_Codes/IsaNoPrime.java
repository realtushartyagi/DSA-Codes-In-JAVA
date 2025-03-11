import java.util.*;

public class IsaNoPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: "); // Added input prompt
        int n = scn.nextInt();
        scn.close();

        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
