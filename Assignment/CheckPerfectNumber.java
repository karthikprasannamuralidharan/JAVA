// 36. Write a Program to check perfect numbers or Not.
public class CheckPerfectNumber {
    public static void main(String[] args) {
        int number = 28; // Change number to check if a different number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
