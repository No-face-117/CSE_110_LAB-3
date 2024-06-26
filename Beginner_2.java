import java.util.Scanner;

public class Beginner_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score;

        System.out.println("Enter your score");
        score = scan.nextInt();

        if (score<100 || score>0) {
            System.out.println("Illegal");
        }
        else{
            if (score>=90 && score<=100) {
                System.out.println("A");
            }
            else if(score>=85 && score<=89){
                System.out.println("A-");
            }
            else if (score>=70 && score<=84) {
                System.out.println("B");
            }
            else if (score>=57 && score<=69) {
                System.out.println("C");
            }
            else if (score>=50 && score<=56) {
                System.out.println("D");
            }
            else if (score>=0 && score<=49)   
            {System.out.println("F");}
            else{}     
        }

       

        
        scan.close();
    }
}


