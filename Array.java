import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        // Input 10 elements of the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Print the array
        System.out.print("The array is: [ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
