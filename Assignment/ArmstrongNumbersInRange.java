// 37. Write a Program to print All Armstrong numbers between 1 to 1000.
public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        printArmstrongNumbers();
    }

    public static void printArmstrongNumbers() {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
