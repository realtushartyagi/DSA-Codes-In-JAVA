import java.util.Scanner;

public class Any_Base_to_Any_Base {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Asking user for inputs
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        System.out.print("Enter the original base: ");
        int b1 = scn.nextInt();

        System.out.print("Enter the target base: ");
        int b2 = scn.nextInt();

        // Converting the number from base b1 to base b2
        int convertedNumber = getValue(n, b1, b2);

        // Displaying the result
        System.out.println("The number " + n + " in base " + b1 + " is " + convertedNumber + " in base " + b2);

        scn.close(); // Closing scanner
    }

    public static int getValue(int n, int b1, int b2) {
        int decimalValue = anyBaseToDecimal(n, b1);
        return decimalToAnyBase(decimalValue, b2);
    }

    public static int anyBaseToDecimal(int n, int b) {
        int result = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            result += digit * power;
            power *= b;
        }

        return result;
    }

    public static int decimalToAnyBase(int n, int b) {
        int result = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % b;
            n /= b;
            result += digit * power;
            power *= 10;
        }

        return result;
    }
}
