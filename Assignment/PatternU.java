// Pattern:
//    1
//   121
//  12321
// 1234321
//123454321
public class PatternU {
    public static void main(String[] args) {
        int rowCount = 5;
        
        for (int i = 0; i < rowCount; i++) {
            // Print spaces
            for (int j = rowCount - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Print left half of the numbers
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            // Print right half of the numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
