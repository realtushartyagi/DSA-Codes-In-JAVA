import java.util.Scanner;

public class Any_Base_to_Decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        System.out.print("Enter the base: ");
        int b = scn.nextInt();

        System.out.println("Decimal equivalent: " + getValueInDecimal(n, b));
        scn.close();
    }

    public static int getValueInDecimal(int n, int b) {
        int ans = 0, power = 1;
        while (n > 0) {
            ans += (n % 10) * power;
            power *= b;
            n /= 10;
        }
        return ans;
    }
}
