// 34. Write a program to print All Strong numbers 1 to 100000.
public class StrongNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Strong numbers between 1 and 100000:");
        printStrongNumbers();
    }

    public static void printStrongNumbers() {
        for (int i = 1; i <= 100000; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
