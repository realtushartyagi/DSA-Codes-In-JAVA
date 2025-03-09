import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        scn.close(); // Close scanner

        // Checking even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
}
