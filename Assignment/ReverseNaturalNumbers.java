// 12. Write a program to print all natural numbers in reverse.
public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Change n to print natural numbers in reverse up to a different value
        System.out.println("Natural numbers in reverse from " + n + " to 1:");
        printReverseNaturalNumbers(n);
    }
    
    public static void printReverseNaturalNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
