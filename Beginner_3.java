import java.util.Scanner;

public class Beginner_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num_1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num_2 = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        int result = 0;
        boolean validOperation = true;

        if (operator.equals("+")) {
            result = num_1 + num_2;
        } else if (operator.equals("-")) {
            result = num_1 - num_2;
        } else if (operator.equals("*")) {
            result = num_1 * num_2;
        } else if (operator.equals("/")) {
            if (num_2 != 0) {
                result = num_1 / num_2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
