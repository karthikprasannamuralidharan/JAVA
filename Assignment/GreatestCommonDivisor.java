// 45. Write Java program to Find the (GCD) Greatest Common Divisor.
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int num1 = 24; // Change num1 to the first number
        int num2 = 36; // Change num2 to the second number
        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
