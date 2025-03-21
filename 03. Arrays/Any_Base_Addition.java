import java.util.Scanner;

public class Any_Base_Addition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Asking user for inputs
        System.out.print("Enter the base: ");
        int b = scn.nextInt();

        System.out.print("Enter the first number: ");
        int n1 = scn.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scn.nextInt();

        // Performing addition
        int sum = getSum(b, n1, n2);

        // Displaying result
        System.out.println("The sum of the numbers in base " + b + " is: " + sum);

        scn.close(); // Closing scanner
    }

    public static int getSum(int b, int n1, int n2) {
        int ans = 0;
        int carry = 0;
        int power = 1;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int l1 = n1 % 10; // Extract last digit of n1
            int l2 = n2 % 10; // Extract last digit of n2

            n1 /= 10; // Remove last digit
            n2 /= 10; // Remove last digit

            int sum = l1 + l2 + carry;
            int q = sum / b; // New carry
            int r = sum % b; // Remainder is the new digit

            ans += (r * power);
            carry = q;
            power *= 10;
        }

        return ans;
    }
}
