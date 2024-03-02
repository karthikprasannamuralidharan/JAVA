// 56. Write a program to check whether a character is uppercase or lowercase alphabet.
public class UppercaseOrLowercase {
    public static void main(String[] args) {
        char ch = 'A'; // Change ch to check for different characters
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
