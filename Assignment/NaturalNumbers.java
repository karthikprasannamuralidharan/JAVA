// 11. Write a program to print all natural numbers from 1 to n.
public class NaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Change n to print natural numbers up to a different value
        System.out.println("Natural numbers from 1 to " + n + ":");
        printNaturalNumbers(n);
    }
    
    public static void printNaturalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
