import java.util.Scanner;

public class Beginner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest;
        if ((num1 == num2 && num3 == 0) || (num2 == num3 && num1 == 0) || (num1 == num3 && num2 == 0)) {
            System.out.println("Two equal and one zero.");
        }
        else{
            if (num1==0 && num2==0 && num3==0) {
                System.out.println("All zeros why?");
            }
            else{
                if (num1 == num2 && num2 == num3) {
                    System.out.println("All numbers are equal.");
                } else {
                    
                    if (num1 >= num2 && num1 >= num3) {
                        largest = num1;
                    } else if (num2 >= num1 && num2 >= num3) {
                        largest = num2;
                    } else {
                        largest = num3;}
                        
        
                    System.out.println("The largest number is: " + largest);
                    
                }
            }
        }
        
       
        
        
        scanner.close();
    }
}


