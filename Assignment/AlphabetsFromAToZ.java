// 15. Write a program to print all alphabets from a to z.
public class AlphabetsFromAToZ {
    public static void main(String[] args) {
        System.out.println("Alphabets from a to z:");
        printAlphabetsFromAToZ();
    }

    public static void printAlphabetsFromAToZ() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
