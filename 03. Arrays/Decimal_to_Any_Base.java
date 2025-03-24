import java.util.Scanner;

public class Decimal_to_Any_Base {
    public static int convertToBase(int n, int b) {
        int ans = 0, power = 1;
        while (n > 0) {
            ans += (n % b) * power;
            n /= b;
            power *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = scn.nextInt();
        System.out.print("Enter target base: ");
        int b = scn.nextInt();

        System.out.println("Converted Number: " + convertToBase(n, b));
        scn.close();
    }
}
