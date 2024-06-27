import java.util.Scanner;

public class Expert_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num_1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num_2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num_3 = scanner.nextInt();

        if (num_1 == num_2 && num_2 == num_3) {
            System.out.println("All numbers are equal");
        } else if (num_1 != num_2 && num_2 != num_3 && num_1 != num_3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        scanner.close();
    }
}
