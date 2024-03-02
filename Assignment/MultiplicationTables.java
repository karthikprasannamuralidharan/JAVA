// 13. Write a program to print Multiplication tables.
public class MultiplicationTables {
    public static void main(String[] args) {
        int n = 5; // Change n to generate multiplication table for a different number
        System.out.println("Multiplication table for " + n + ":");
        printMultiplicationTable(n);
    }
    
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
