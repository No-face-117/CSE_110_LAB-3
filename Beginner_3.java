import java.util.Scanner;

public class Beginner_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num_1 = scan.nextInt();

        System.out.println("Enter the second number : ");
        int num_2 = scan.nextInt();

        scan.nextLine();

        System.out.println("What do you want to do?");
        System.out.println("add : '+'");
        System.out.println("subtract : '-'");
        System.out.println("multiply : '*'");
        System.out.println("divide : '/'");
        System.out.println();
        System.out.println("so -=> add / subtract / multiply / divide");
        String score = scan.nextLine();

        System.out.println();
        System.out.println("Number 1 is : " + num_1);
        System.out.println("Number 2 is : " + num_2);
        System.out.println();

        int result = 0;
        boolean validOperation = true;

        switch (score) {
            case "add":
                result = num_1 + num_2;
                break;
            case "subtract":
                result = num_1 - num_2;
                break;
            case "multiply":
                result = num_1 * num_2;
                break;
            case "divide":
                if (num_2 != 0) {
                    result = num_1 / num_2;
                } else {
                    System.out.println("Division by zero is not allowed!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("The result of the operation is: " + result);
        }

        scan.close();
    }
}


