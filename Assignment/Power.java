// 25. Write a program to find the value of one number raised to the power of another.
public class Power {
    public static void main(String[] args) {
        int base = 2; // Change base to set the base number
        int exponent = 3; // Change exponent to set the exponent
        long result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static long calculatePower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
