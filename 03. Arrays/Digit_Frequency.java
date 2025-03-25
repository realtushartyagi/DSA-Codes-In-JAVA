import java.util.*;

public class Digit_Frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        System.out.print("Enter the digit to count: ");
        int d = scn.nextInt();

        // Calling function & displaying result
        System.out.println("Frequency of " + d + " in " + n + ": " + getDigitFrequency(n, d));

        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int freq = 0;
        while (n > 0) {
            if (n % 10 == d)
                freq++;
            n /= 10;
        }
        return freq;
    }
}
