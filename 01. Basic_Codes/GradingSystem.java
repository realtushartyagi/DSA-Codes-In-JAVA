import java.util.*;

public class GradingSystem {
    public static void main(String[] args) {
        // Input - don't change this code
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter marks: "); // Added user prompt
        int marks = scn.nextInt();
        scn.close(); // Closing Scanner to prevent resource leak

        // Grading logic
        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80) {
            System.out.println("good");
        } else if (marks > 70) {
            System.out.println("fair");
        } else if (marks > 60) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
    }
}
