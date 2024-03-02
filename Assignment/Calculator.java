// 1. Create a simple calculator program that takes two numbers and an
// operator (+, -, *) as input. Perform the corresponding operation and
// display the result. If an invalid operator is entered, print an error message.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *): ");
        char operator = scanner.next().charAt(0);
        
        double result;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }
        System.out.println("Result: " + result);
    }
}
