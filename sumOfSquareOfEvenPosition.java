import java.util.*;

public class sumOfSquareOfEvenPosition {
    public static void main(String args[]) {
        System.out.println("Enter the no.:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i = 0;
        int d = 0;
        while (a > 0) {
            d = a % 10;
            a = a / 10;
        }
        if (i % 2 == 0) {
            sum = sum + d * d;
        }
        System.out.println("Required sum is : " + sum);
    }
}
