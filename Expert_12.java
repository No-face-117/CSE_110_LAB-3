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
            calculate_change(change);
        } else if (amount_given < amount_to_be_paid) {
            int amount_needed = amount_to_be_paid - amount_given;
            System.out.println("The customer needs to pay: " + amount_needed + " taka");
        } else {
            System.out.println("The exact amount was given. No change needed.");
        }

        scanner.close();
    }

    public static void calculate_change(int change) {
        int[] notes = {100, 50, 20, 10};
        int[] coins = {5, 2, 1};
        
        for (int note : notes) {
            if (change >= note) {
                int count = change / note;
                change %= note;
                System.out.println(note + " taka note: " + count);
            }
        }

        for (int coin : coins) {
            if (change >= coin) {
                int count = change / coin;
                change %= coin;
                System.out.println(coin + " taka coin: " + count);
            }
        }
    }
}
