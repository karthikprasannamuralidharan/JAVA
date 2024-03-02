// 49. Write a program to check whether a number is negative, positive, or zero.
public class CheckNegativePositiveZero {
    public static void main(String[] args) {
        int num = -10; // Change num to check for different numbers
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }
    }
}
