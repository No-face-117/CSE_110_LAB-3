import java.util.Scanner;

public class Expert_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        float side_1 = scanner.nextFloat();

        System.out.print("Enter the length of the second side: ");
        float side_2 = scanner.nextFloat();

        System.out.print("Enter the length of the third side: ");
        float side_3 = scanner.nextFloat();

        if (side_1 == side_2 && side_2 == side_3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side_1 == side_2 || side_2 == side_3 || side_1 == side_3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }

        scanner.close();
    }
}
