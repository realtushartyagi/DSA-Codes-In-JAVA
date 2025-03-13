import java.util.Scanner;

public class ReverseofNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: "); // User-friendly prompt
    int n = scn.nextInt();
    scn.close(); // Close Scanner

    if (n == 0) {
      System.out.println(0); // Handle case where input is 0
      return;
    }

    n = Math.abs(n); // Handle negative numbers (optional)

    while (n > 0) {
      System.out.println(n % 10); // Print last digit
      n = n / 10; // Remove last digit
    }
  }
}
