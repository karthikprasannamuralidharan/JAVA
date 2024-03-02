// 23. Write a program to print the ASCII values.
public class ASCIITable {
    public static void main(String[] args) {
        System.out.println("ASCII values:");
        printASCII();
    }

    public static void printASCII() {
        for (int i = 0; i <= 255; i++) {
            System.out.println("ASCII value of " + (char) i + " is " + i);
        }
    }
}
