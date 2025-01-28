import java.util.Scanner;

public class Main{
    public static double gauss(double x, int n) {
        double sum = 1.0; // The first term is always 1
        double term = 1.0; // To store each calculated term
        double sign = -1.0; // Alternating sign for each term

        for (int i = 1; i < n; i++) {
            // Update term manually without using pow or factorial
            term *= (x * x) / i; // Multiply by (x^2 / i)
            sum += sign * term;  // Add the term with alternating sign
            sign *= -1;          // Flip the sign for the next iteration
        }

        return sum;
    }

    public static void main(String[] args) {
        double x = 1.0;  // Value for x
        int n = 10;      // Number of terms

        double result = gauss(x, n);
        System.out.println("Estimated value of exp(-x^2) using " + n + " terms: " + result);
    }
}