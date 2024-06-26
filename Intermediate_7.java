import java.util.Scanner;

public class Intermediate_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int x = scan.nextInt();
        
        if (x < 0) {
            System.out.println("output: " + (2*x));
        }
        else if (0<=x && x<2) {
            System.out.println("output: " + (2+x));
        }
        else if (2<=x && x<5) {
            double mass = Math.pow(x, 2) - 1;
            System.out.println("output: " + mass);
        }
        else if (x >= 5) {
            double masse = 3*Math.pow(x, 2) + 2;
            System.out.println("output: " + masse);
        }
        else{}


        

        scan.close();
    }
}
