import java.util.Scanner;

public class quotientndrem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the divisor");
        int divi=sc.nextInt();
        if(divi>0) {
            int quotient = n / divi;
            int remainder = n % divi;
            System.out.println("The quotient is " + quotient);
            System.out.println("The remainder is " + remainder);
        }
        else {
            System.out.println("invalid input");
            System.exit(0);
        }
    }
}
