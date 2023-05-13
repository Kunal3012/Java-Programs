import java.util.*;

class ArmstrongNumber {
    public static void main(String args[]) {
        System.out.println("Enter the no.: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int sum = 0;
        while (a > 0) {
            int d = a % 10;
            a /= 10;
            sum += Math.pow(d, 3);
        }
        if (sum == temp) {
            System.out.println("Given number is an Armstorng number.");
        } else {
            System.out.println("Given number is not an Armstorng number.");
        }
    }
}
