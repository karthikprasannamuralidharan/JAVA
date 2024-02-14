
public class SumSubarrays {

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};

        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int maxSum = subarrays(arr);
        System.out.println("Maximum sum of subarrays: " + maxSum);
    }

    public static int subarrays(int a[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}
