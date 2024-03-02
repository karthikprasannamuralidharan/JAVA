// 18. Write a program to print all even numbers between 1 to 100.
public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 to 100:");
        printEvenNumbers();
    }

    public static void printEvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
