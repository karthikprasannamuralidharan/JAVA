package Arrays;

public class KadanesAlgo {

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
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum < 0) {
                    sum = 0;
                }
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}
