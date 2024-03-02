// 41. Write a Program to Check Given String is a Palindrome or Not.
public class CheckPalindromeString {
    public static void main(String[] args) {
        String str = "radar"; // Change str to check if a different string is a palindrome
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
