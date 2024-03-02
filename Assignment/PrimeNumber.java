// 28. Write a program to Check Whether a Given Number is Prime or Not
public class PrimeNumber {
    public static void main(String[] args) {
        int number = 13; // Change number to check if a different number is prime
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static boolean checkPrime(int number) {
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
