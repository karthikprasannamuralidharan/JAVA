// 4. Write a program to sort an array in ascending order.
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
