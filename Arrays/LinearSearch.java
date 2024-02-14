package Arrays;

import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        int key;
        System.out.println("Enter value of key: ");
        key = input.nextInt();

        boolean keyFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                keyFound = true;
                System.out.println("Key " + key + " found at position " + i);
            }

        }
        if (!keyFound) {
            System.out.println("Key not found!");
        }

    }

}
