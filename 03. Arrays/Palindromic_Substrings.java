import java.util.*;

public class Palindromic_Substrings {

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Function to find and print all palindromic substrings
    public static void solution(String str) {
        for (int st = 0; st < str.length(); st++) {
            for (int end = st; end < str.length(); end++) {
                String subString = str.substring(st, end + 1);
                if (isPalindrome(subString))
                    System.out.println(subString);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.next();
        System.out.println("Palindromic Substrings:");
        solution(str);
        scn.close();
    }
}
