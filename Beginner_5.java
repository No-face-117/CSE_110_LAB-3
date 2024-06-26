import java.util.Scanner;

public class Beginner_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        
        if (year%4 == 0)
        {
            if (year%100  == 0) 
            {
                if (year%400 == 0) 
                {
                    if (year <= 2024) 
                    {
                        System.out.println(year + " was a leap year.");
                    }else{System.out.println(year + " will be a leap year.");}
                }else{if (year <= 2024) {
                    System.out.println(year + " was not a leap year.");
                }else{System.out.println(year + " will not be a leap year.");}}
            }else{if (year <= 2024) {
                System.out.println(year + " was a leap year.");
            }else{System.out.println(year + " will be a leap year.");}}
        }else{if (year <= 2024) {
            System.out.println(year + " was not a leap year.");
        }else{System.out.println(year + " will not be a leap year.");}}
        

        scan.close();
    }
}
