// 35. Write a Program to print All perfect numbers 1 to 10000.
public class PerfectNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 10000:");
        printPerfectNumbers();
    }

    public static void printPerfectNumbers() {
        for (int i = 1; i <= 10000; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
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
