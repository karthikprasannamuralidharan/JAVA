// 16. Write a program to print reverse alphabets from Z to A.
public class ReverseAlphabetsFromZToA {
    public static void main(String[] args) {
        System.out.println("Reverse alphabets from Z to A:");
        printReverseAlphabetsFromZToA();
    }

    public static void printReverseAlphabetsFromZToA() {
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
