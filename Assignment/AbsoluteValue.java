// 66. Find the absolute value of a number entered through the keyboard.
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        double absoluteValue = Math.abs(number);
        System.out.println("Absolute value of " + number + " is " + absoluteValue);
    }
}
