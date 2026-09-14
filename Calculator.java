import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = readDouble(input, "Enter first number: ");
        char operator = readOperator(input);
        double num2 = readDouble(input, "Enter second number: ");

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    input.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                input.close();
                return;
        }

        System.out.println("Result: " + result);
        input.close();
    }

    private static double readDouble(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                return input.nextDouble();
            }
            System.out.println("Invalid number. Please enter a valid numeric value.");
            input.next();
        }
    }

    private static char readOperator(Scanner input) {
        while (true) {
            System.out.print("Enter an operator (+, -, *, /): ");
            String token = input.next();
            if (token.length() == 1) {
                char op = token.charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    return op;
                }
            }
            System.out.println("Invalid operator! Please enter one of: +, -, *, /");
        }
    }
}
