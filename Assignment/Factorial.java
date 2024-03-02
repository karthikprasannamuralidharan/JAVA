// 24. Write a program to find the factorial value of any number.
public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Change num to find factorial of a different number
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
