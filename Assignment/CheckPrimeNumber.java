// 39. Write a Program to check Prime numbers or not.
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int number = 29; // Change number to check if a different number is prime
        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
