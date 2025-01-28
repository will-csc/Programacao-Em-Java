import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a base value: ");
        int n = in.nextInt();
        System.out.println("Enter a power value: ");
        int p = in.nextInt();
        
        System.out.printf("\nThe result is %d^%d is: %s",n,p,pow(n,p).toString());
    }
    public static BigInteger pow(int n, int p){
        if(p == 0) return BigInteger.ONE;  
        
        BigInteger t = pow(n, p / 2);  
        
        if(p % 2 == 0){
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(n));
        }
    }
}