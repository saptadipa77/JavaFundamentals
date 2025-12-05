import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the number is even"+" "+n);
        }
        else
        {
            System.out.println("the number is odd"+" "+n);
        }
    }
}
