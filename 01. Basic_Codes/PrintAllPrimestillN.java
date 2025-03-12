import java.util.Scanner;

public class PrintAllPrimestillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the lower and upper limits: "); // Input prompt
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        scn.close(); // Closing Scanner to prevent resource leak

        for (int n = lo; n <= hi; n++) {
            if (n < 2)
                continue; // Skip numbers < 2 (not prime)

            boolean isPrime = true;
            for (int div = 2; div * div <= n; div++) { // Check divisibility
                if (n % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}
