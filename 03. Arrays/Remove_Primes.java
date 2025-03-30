import java.util.*;

public class Remove_Primes {

    // Function to check if a number is prime
    public static boolean isPrime(int val) {
        if (val < 2)
            return false; // Handling edge cases
        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0)
                return false;
        }
        return true;
    }

    // Function to remove prime numbers from the list
    public static void solution(ArrayList<Integer> al) {
        al.removeIf(Remove_Primes::isPrime); // Efficient way to remove primes
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }

        // Remove prime numbers
        solution(al);

        // Output result
        System.out.println("After removing primes: " + al);

        scn.close();
    }
}
