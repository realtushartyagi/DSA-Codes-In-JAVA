import java.util.Scanner;

public class Any_Base_Subtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Asking user for inputs
        System.out.print("Enter the base: ");
        int base = scn.nextInt();

        System.out.print("Enter the first number (smaller): ");
        int num1 = scn.nextInt();

        System.out.print("Enter the second number (larger): ");
        int num2 = scn.nextInt();

        // Performing subtraction
        int result = getDifference(base, num1, num2);

        // Displaying result
        System.out.println("The difference of the numbers in base " + base + " is: " + result);

        scn.close(); // Closing scanner
    }

    public static int getDifference(int base, int num1, int num2) {
        int result = 0;
        int power = 1;
        int borrow = 0;

        while (num2 > 0) { // Ensure to process all digits of num2
            int digit1 = num1 % 10; // Extract last digit of num1
            int digit2 = num2 % 10; // Extract last digit of num2
            num1 /= 10; // Remove last digit
            num2 /= 10; // Remove last digit

            int diff = digit2 - borrow - digit1;
            if (diff < 0) {
                diff += base;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result += diff * power;
            power *= 10;
        }

        return result;
    }
}
