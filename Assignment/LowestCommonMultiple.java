// 46. Write Java program to Find the (LCM) Lowest Common Multiple.
public class LowestCommonMultiple {
    public static void main(String[] args) {
        int num1 = 24; // Change num1 to the first number
        int num2 = 36; // Change num2 to the second number
        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateGCD(num1, num2);
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
