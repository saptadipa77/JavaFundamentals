import java.util.Scanner;

public class LineCompare {

    public static double getLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates for Line 1:");
        System.out.print("x1 = ");
        double x1 = sc.nextDouble();
        System.out.print("y1 = ");
        double y1 = sc.nextDouble();
        System.out.print("x2 = ");
        double x2 = sc.nextDouble();
        System.out.print("y2 = ");
        double y2 = sc.nextDouble();
        System.out.println("\nEnter coordinates for Line 2:");
        System.out.print("x1 = ");
        double p1 = sc.nextDouble();
        System.out.print("y1 = ");
        double q1 = sc.nextDouble();
        System.out.print("x2 = ");
        double p2 = sc.nextDouble();
        System.out.print("y2 = ");
        double q2 = sc.nextDouble();
        double length1 = getLength(x1, y1, x2, y2);
        double length2 = getLength(p1, q1, p2, q2);

        System.out.println("\nLength of Line 1 = " + length1);
        System.out.println("\nLength of Line 2 = " + length2);

        if (length1 == length2) {
            System.out.println("UC2: Both lines are equal in length.");
        } else {
            System.out.println("UC2: Lines are NOT equal.");
        }
        if (length1 > length2) {
            System.out.println("UC3: Line 1 is longer than Line 2.");
        } else if (length1 < length2) {
            System.out.println("UC3: Line 2 is longer than Line 1.");
        } else {
            System.out.println("UC3: Both lines are EQUAL.");
        }
    }
}

