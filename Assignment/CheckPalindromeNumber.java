// 40. Write a Program to Check Given Number is a Palindrome or Not.
public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int number = 12321; // Change number to check if a different number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
