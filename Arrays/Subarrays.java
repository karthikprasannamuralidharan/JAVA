
package Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        subarrays(arr);
    }
    
    public static void subarrays(int a[]){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]+" ");
                    count++;
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Count of subarrays is: "+count);
    }
}
