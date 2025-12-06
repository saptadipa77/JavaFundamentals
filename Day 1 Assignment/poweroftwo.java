import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        n = sc.nextInt();
        if(n>=0 && n<31)
        {
            for(int i=0;i<n;i++)
            {
                if(i==0)
                    System.out.println(1);
                else if(i==1)
                {
                    System.out.println(2);
                }
                else
                {
                    System.out.println((int)Math.pow(2,i));
                }
            }
        }
        else{
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}
