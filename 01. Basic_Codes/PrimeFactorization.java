import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: "); // Added input prompt
        int n = scn.nextInt();
        scn.close(); // Closing Scanner after input

        // Optimized Prime Factorization
        for (int factor = 2; factor * factor <= n; factor++) {
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            }
        }

        // If there's any prime factor left > sqrt(n), print it
        if (n > 1) {
            System.out.print(n);
        }
    }
}
