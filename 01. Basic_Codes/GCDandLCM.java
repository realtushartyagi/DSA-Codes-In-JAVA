import java.util.*;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter first number: ");
        int n1 = scn.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scn.nextInt();

        int dvd = n1;
        int dsr = n2;

        // Computing GCD using the Euclidean Algorithm
        while (dvd % dsr != 0) {
            int rem = dvd % dsr;
            dvd = dsr;
            dsr = rem;
        }

        int gcd = dsr;
        int lcm = (n1 * n2) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        scn.close(); // Closing Scanner to prevent resource leak
    }
}
