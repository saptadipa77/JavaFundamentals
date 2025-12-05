import java.util.Scanner;

public class swapnumbers {
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        a=a+b; //2,3 2+3=5 b=a-b
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("the numbers are"+" "+a+" "+b);

    }
}
