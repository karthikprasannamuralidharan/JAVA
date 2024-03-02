// 50. Write a program to check whether a number is divisible by 5 and 11 or not.
public class DivisibleBy5And11 {
    public static void main(String[] args) {
        int num = 55; // Change num to check for different numbers
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is not divisible by both 5 and 11.");
        }
    }
}
