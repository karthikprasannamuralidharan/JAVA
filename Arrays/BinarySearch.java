package Arrays;

import java.util.Scanner;

public class BinarySearch {
    
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
        
        int end = arr.length-1;
        
        for (int start = 0;start <= end;) {            
            int mid = (start + end) / 2;
            
            if (arr[mid] == key) {
                System.out.println("Key " + key + " found at index " + mid);
                keyFound=true;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }          
        }
        
        if (!keyFound) {
            System.out.println("Key not found");
        }   
    }   
}
