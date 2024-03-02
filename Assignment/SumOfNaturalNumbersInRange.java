// 20. Write a program to find sum of all natural numbers between 1 to n.
public class SumOfNaturalNumbersInRange {
    public static void main(String[] args) {
        int n = 10; // Change n to set the upper limit
        int sum = calculateSum(n);
        System.out.println("Sum of all natural numbers between 1 to " + n + " is: " + sum);
    }

    public static int calculateSum(int n) {
        return (n * (n + 1)) / 2;
    }
}
