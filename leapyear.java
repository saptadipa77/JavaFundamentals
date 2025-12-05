import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        System.out.println("enter no of testcases");
        t=sc.nextInt();
        while(t-->0) {
            int year;
            System.out.println("Enter the year");
            year = sc.nextInt();
            if (year % 4 == 0)
                System.out.println("Leap year");
            else
                System.out.println("Not Leap year");
        }
    }
}
