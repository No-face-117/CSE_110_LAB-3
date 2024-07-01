import java.util.Scanner;

public class Expert_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to be paid (in taka): ");
        int amount_to_be_paid = scanner.nextInt();

        System.out.print("Enter the amount given by the customer (in taka): ");
        int amount_given = scanner.nextInt();

        if (amount_given > amount_to_be_paid) {
            int change = amount_given - amount_to_be_paid;
            System.out.println("Change to be returned: " + change + " taka");

            if (change >= 100) {
                int count = change / 100;
                change %= 100;
                System.out.println("100 taka note: " + count);
            }

            if (change >= 50) {
                int count = change / 50;
                change %= 50;
                System.out.println("50 taka note: " + count);
            }

            if (change >= 20) {
                int count = change / 20;
                change %= 20;
                System.out.println("20 taka note: " + count);
            }

            if (change >= 10) {
                int count = change / 10;
                change %= 10;
                System.out.println("10 taka note: " + count);
            }

            if (change >= 5) {
                int count = change / 5;
                change %= 5;
                System.out.println("5 taka coin: " + count);
            }

            if (change >= 2) {
                int count = change / 2;
                change %= 2;
                System.out.println("2 taka coin: " + count);
            }

            if (change >= 1) {
                int count = change / 1;
                change %= 1;
                System.out.println("1 taka coin: " + count);
            }
        } else if (amount_given < amount_to_be_paid) {
            int amount_needed = amount_to_be_paid - amount_given;
            System.out.println("The customer needs to pay: " + amount_needed + " taka");
        } else {
            System.out.println("The exact amount was given. No change needed.");
        }

        scanner.close();
    }
}
