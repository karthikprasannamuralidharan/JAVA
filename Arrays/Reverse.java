package Arrays;

public class Reverse {

    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int start = 0, end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println("Reversed Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");

    }

}
