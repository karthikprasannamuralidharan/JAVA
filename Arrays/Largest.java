
package Arrays;

import java.util.Scanner;


public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i : arr) {
            if(i>max){
                max=i;
            }
            if (i<min) {
                min=i;
            }
        }
        
        System.out.println("Max in array is "+max);
        System.out.println("Min in array is "+min);

    }
    
}
