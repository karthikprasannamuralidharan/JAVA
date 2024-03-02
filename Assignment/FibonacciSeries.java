// 33. Write a program to print Fibonacci series up to n terms.
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Change n to set the number of terms
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
