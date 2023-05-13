import java.util.*;

public class UseOfStatic {

    class MethodCallingByDifferentClass {
        public static void main(String args[]) {
            System.out.println("Enter the no. of terms:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            double k = 0;
            for (double i = 2; i <= a; i++) {
                k += (1 / Factorial.factorial(2 * (i - 1)));
            }
            System.out.println("Required sum is  = " + k);
        }
    }

    class Factorial {
        static double factorial(double n) {
            double l = 1;
            for (double j = 1; j <= n; j++) {
                l = l * j;
            }
            return l;
        }
    }

}
