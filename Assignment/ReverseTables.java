// 14. Write a program to print reverse tables.
public class ReverseTables {
    public static void main(String[] args) {
        int n = 5; // Change n to generate reverse multiplication table for a different number
        System.out.println("Reverse multiplication table for " + n + ":");
        printReverseMultiplicationTable(n);
    }

    public static void printReverseMultiplicationTable(int n) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
