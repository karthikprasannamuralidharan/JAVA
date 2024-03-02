// 27. Write a program to sum of its digits.
public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345; // Change number to find the sum of digits of a different number
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
