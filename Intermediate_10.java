import java.util.Scanner;

public class Intermediate_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third float number: ");
        float num3 = scanner.nextFloat();

        float max = num1;
        float min = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        scanner.close();
    }
}
