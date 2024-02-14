package Arrays;

public class Pairs {

    public static void pair(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")" + " ");
                count++;
            }
            System.out.println("");
        }
        System.out.println("No: of pairs available: " + count);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        pair(arr);

    }

}
