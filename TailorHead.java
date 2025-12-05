import java.util.Scanner;

public class TailorHead {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of flips");
        int n=sc.nextInt();
        if(n>=0)
        {
            System.out.println("Entered no is positive");
            int t=0,h=0;
            for(int i=0;i<n;i++)
            {
                double generate=Math.random();
                System.out.println(generate);
                if(generate<0.5)
                {
                    t++;
                }
                else
                {
                    h++;
                }
            }
            double hper=(double)h/n*100;
            double tper=(double)t/n*100;
            System.out.println("the head percentage "+hper);
            System.out.println("the tail percentage "+tper);
        }
        else {
            System.out.println("Entered no is negative.Terminate the program");
            System.exit(0);
        }
    }
}

