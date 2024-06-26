import java.util.Scanner;

public class Intermediate_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int x = scan.nextInt();
   
        int y = x / 100000;
        int y_l = y % 10;
        int y_f = y / 10; 

        if (y_l == 1) {
            System.out.println("Student Joined BRAC in Spring " + y_f + ".");
        }
        else if (y_l == 2) {
            System.out.println("Student Joined BRAC in Fall " + y_f + ".");
        }
        else if (y_l == 3) {
            System.out.println("Student Joined BRAC in Summer " + y_f + ".");
        }
        else{System.out.println("The person in question is not a BRAC student.");}
        

        

        scan.close();
    }
}
