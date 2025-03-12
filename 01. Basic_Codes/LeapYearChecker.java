import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a year: ");
        int year = scn.nextInt();

        scn.close(); // Close scanner

        // Leap year condition:
        // A year is a leap year if:
        // 1. It is divisible by 400, OR
        // 2. It is divisible by 4 but NOT by 100
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
