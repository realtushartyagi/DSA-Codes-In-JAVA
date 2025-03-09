import java.util.*;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }

        scn.close();
    }
}
