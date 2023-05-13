public class Calculate {
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
