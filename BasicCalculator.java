import java.util.Scanner;

public class BasicCalculator {
    
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Basic Calculator ===");

        while (keepRunning) {
            System.out.print("\nEnter first number: ");
            double num1 = scn.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scn.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scn.nextDouble();

            double result;
             switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }



            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scn.next();

            if (!response.equalsIgnoreCase("yes")) {
                keepRunning = false;
            }
        }

        System.out.println("Calculator exited. Goodbye!");
        scn.close();
    }
}
