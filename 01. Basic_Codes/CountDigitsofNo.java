import java.util.*;

public class CountDigitsofNo {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: "); // Added user-friendly input prompt
    int n = scn.nextInt();

    int counter = (n == 0) ? 1 : 0; // Handling edge case for n = 0

    while (n > 0) {
      n = n / 10;
      counter++;
    }

    System.out.println("Number of digits: " + counter);

    scn.close();
  }
}
