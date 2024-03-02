// 38. Write a Program to check Armstrong numbers or Not.
public class CheckArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // Change number to check if a different number is Armstrong
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
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
