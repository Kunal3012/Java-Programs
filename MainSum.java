import java.util.Scanner;
 class Calculate {
    private int numTerms;

    // Constructor to initialize the number of terms
    public Calculate(int numTerms) {
        this.numTerms = numTerms;
    }

    // Method to calculate the sum of the first series
    public double calculateSeriesOne() {
        double sum = 0;
        int sign = 1;
        int denominator = 1;

        for (int i = 1; i <= numTerms; i++) {
            sum += sign * (double) i / denominator;
            sign = -sign;
            denominator += 2;
        }

        return sum;
    }

    // Method to calculate the sum of the second series
    public double calculateSeriesTwo() {
        double sum = 0;
        int factorial = 1;

        for (int i = 1; i <= numTerms; i++) {
            factorial *= 2 * i * (2 * i - 1);
            sum += 1.0 / factorial;
        }

        return sum;
    }
}

 class MainSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        // Create an instance of the Calculate class with the given number of terms
        Calculate calculator = new Calculate(numTerms);

        // Calculate and print the sum of the first series
        double sum1 = calculator.calculateSeriesOne();
        System.out.println("Sum of Series 1: " + sum1);

        // Calculate and print the sum of the second series
        double sum2 = calculator.calculateSeriesTwo();
        System.out.println("Sum of Series 2: " + sum2);
    }
}
