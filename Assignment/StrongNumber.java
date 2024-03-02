// 32. Write a program to check whether a number is a Strong Number or not.
public class StrongNumber {
    public static void main(String[] args) {
        int number = 145; // Change number to check if a different number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number");
        } else {
            System.out.println(number + " is not a Strong Number");
        }
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
