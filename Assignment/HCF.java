// 28. Write a program to calculate HCF of Two given numbers.
public class HCF {
    public static void main(String[] args) {
        int num1 = 24; // Change num1 to the first number
        int num2 = 36; // Change num2 to the second number
        int hcf = calculateHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
