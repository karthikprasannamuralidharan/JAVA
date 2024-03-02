// 31. Write a program to find the number and sum of all integers between 100 and 200 which are divisible by 9.
public class DivisibleByNine {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("Number of integers divisible by 9 between 100 and 200: " + count);
        System.out.println("Sum of integers divisible by 9 between 100 and 200: " + sum);
    }
}
