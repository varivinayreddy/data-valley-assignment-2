import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = sumOf2ndAnd3rdLargest(values);
        System.out.println("Sum of 2nd and 3rd largest numbers: " + sum);
    }

    public static int sumOf2ndAnd3rdLargest(int[] values) {
        Arrays.sort(values);
        int length = values.length;
        if (length < 3) {
            System.out.println("Array should have at least 3 elements.");
            return 0;
        }
        return values[length - 2] + values[length - 3];
    }
}
