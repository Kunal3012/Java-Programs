import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;

        // Input 10 elements of the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of the elements in the array
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }

        // Print the sum of the elements in the array
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
