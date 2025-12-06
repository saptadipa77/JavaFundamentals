import java.util.Scanner;

public class primefactors {
    public static boolean isPrime(int val) {
        if (val <= 1) return false;
        for (int i = 2; i <= val / 2; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

            for(int i=1;i<=n;i++)
            {
                if(n%i==0 && isPrime(i))
                {
                    System.out.println("the factors are"+" "+i);
                }
            }

    }
}
