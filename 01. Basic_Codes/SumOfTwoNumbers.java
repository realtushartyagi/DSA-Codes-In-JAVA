import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();

        scn.close(); // Closing Scanner to prevent memory leak

        // Calculating the sum
        int sum = num1 + num2;

        // Printing the result
        System.out.println("Sum: " + sum);
    }
}
