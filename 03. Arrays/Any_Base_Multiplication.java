import java.util.Scanner;

public class Any_Base_Multiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Asking user for inputs
        System.out.print("Enter the base: ");
        int b = scn.nextInt();

        System.out.print("Enter the first number: ");
        int n1 = scn.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scn.nextInt();

        // Performing multiplication
        int product = getProduct(b, n1, n2);

        // Displaying result
        System.out.println("The product of the numbers in base " + b + " is: " + product);

        scn.close(); // Closing scanner
    }

    public static int getProduct(int b, int n1, int n2) {
        int ans = 0;
        int power = 1;

        while (n2 != 0) {
            int l2 = n2 % 10;
            n2 /= 10;

            int pwsd = gpwsd(b, n1, l2);
            ans = getSum(b, ans, pwsd * power);
            power *= 10;
        }
        return ans;
    }

    public static int gpwsd(int b, int n1, int d2) {
        int ans = 0;
        int power = 1;
        int carry = 0;

        while (n1 != 0 || carry != 0) {
            int l1 = n1 % 10;
            n1 /= 10;

            int product = l1 * d2 + carry;
            int q = product / b;
            int r = product % b;

            ans += (r * power);
            carry = q;
            power *= 10;
        }

        return ans;
    }

    public static int getSum(int b, int n1, int n2) {
        int ans = 0;
        int carry = 0;
        int power = 1;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int l1 = n1 % 10;
            int l2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int sum = l1 + l2 + carry;
            int q = sum / b;
            int r = sum % b;

            ans += (r * power);
            carry = q;
            power *= 10;
        }

        return ans;
    }
}
