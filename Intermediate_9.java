import java.util.Scanner;

public class Intermediate_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = 0;
        int earnings = 0;
        double tax = 0;

        System.out.println("Enter Your earnings: ");
        earnings = scan.nextInt();

        System.out.println();

        System.out.println("Enter Your age: ");
        age = scan.nextInt();

        System.out.println();

        if (age < 18) {
            System.out.println("Yey, Your tax amounts to 0 Tk!");
        } else {
            if (earnings < 10000) {
                System.out.println("Yey, Your tax amounts to 0 Tk!");
            } else if (earnings >= 10000 && earnings <= 20000) {
                tax = earnings * 0.05;
                System.out.println("Your tax amounts to " + tax + " Tk!");
            } else if (earnings > 20000) {
                tax = earnings * 0.10;
                System.out.println("Your tax amounts to " + tax + " Tk!");
            }
        }

        scan.close();
    }
}
