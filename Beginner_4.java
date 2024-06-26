import java.util.Scanner;

public class Beginner_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int number = scan.nextInt();

        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("The number " + number + " is divisible by both 5 and 7.");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}
