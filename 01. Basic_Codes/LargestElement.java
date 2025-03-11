import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = { 5, 34, 78, 2, 45, 1, 99, 23 };
        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        System.out.println("Largest element is: " + max);
    }
}
