import java.util.Scanner;

public class Beginner_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int number = scan.nextInt();
        
        if (number < 0) {
            System.out.println("Number is negative.");
        }
        else if (number == 0) {
            System.out.println("Number is zero.");
        }
        else if ((number > 0) && (number%2 == 0)) {
            System.out.println("Number is positive and even.");
        }
        else if ((number > 0) && (number%2 != 0)) {
            System.out.println("Number is positive and odd.");
        }
        else{}

        

        scan.close();
    }
}
