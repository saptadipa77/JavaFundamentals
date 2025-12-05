import java.util.Scanner;

public class harmonicmean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n>0)
        {
            double val=1;
            for(int i=2;i<=n;i++)
            {
                val=val+(double)1/i;
            }
            val=val+(double)1/n;
            System.out.println("The harmonic mean is "+val);
        }
        else
        {
            System.out.println("invalid number");
            System.exit(0);
        }
    }
}
