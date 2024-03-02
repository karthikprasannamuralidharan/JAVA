// 55. Write a program to input any character and check whether it is alphabet, digit, or special character.
public class AlphabetOrDigitOrSpecial {
    public static void main(String[] args) {
        char ch = '5'; // Change ch to check for different characters
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}
