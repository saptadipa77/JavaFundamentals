import java.util.Scanner;

public class vowelorconsonant {
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        // Convert to lowercase to simplify checking
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Not an alphabet!");
        }
    }
}
