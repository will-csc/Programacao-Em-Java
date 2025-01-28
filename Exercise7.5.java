import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double x = 1.0;
        int n = 10;

        double estimatedValue = myexp(x, n);

        System.out.println("Estimated value of e^" + x + " using " + n + " terms: " + estimatedValue);
    }
    public static long factorial(int i) {
        long result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        return result;
    }
    public static double myexp(double x, int n) {
        double result = 1.0;  

        for (int i = 1; i < n; i++) {
            result += Math.pow(x, i) / factorial(i);
        }

        return result;
    }
    
}