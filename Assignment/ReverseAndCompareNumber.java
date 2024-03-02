// 65. A five-digit number is entered through the keyboard. Write a program to obtain the reversed number
// and to determine whether the original and reversed numbers are equal or not.
import java.util.Scanner;

public class ReverseAndCompareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
        if (originalNumber == reversedNumber) {
            System.out.println("The original and reversed numbers are equal.");
        } else {
            System.out.println("The original and reversed numbers are not equal.");
        }
    }
}
