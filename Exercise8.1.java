import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a value for the array size: ");
        int size = in.nextInt();
        
        double[] a = new double[size];  // Corrigido para array de double
        a = powerArray(a);
        
        int i = 0;
        for (double value : a) {
            System.out.printf("\n'a[%d]' (%.2f raised by 2) = %.2f%n", i,Math.sqrt(value), value);
            i++;
        }
    }
    public static double[] powerArray(double[] a) {
        Random random = new Random();
        
        for (int i = 0; i < a.length; i++) {  
            a[i] = Math.pow(random.nextInt(10), 2);  
        }
        return a;
    }
}