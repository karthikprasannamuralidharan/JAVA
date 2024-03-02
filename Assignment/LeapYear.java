// 54. Write a program to check whether a year is leap year or not.
public class LeapYear {
    public static void main(String[] args) {
        int year = 2024; // Change year to check for different years
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
