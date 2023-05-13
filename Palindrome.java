import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Enter the no.:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int d = 0;
        int rev = 0;
        while (a > 0) {
            d = a % 10;
            rev = rev * 10 + d;
            a = a / 10;
        }
        if (temp == rev) {
            System.out.print("Entered number is a Palindrome:");
        } else {
            System.out.print("Entered number is not a Palindrome:");
        }
    }
}