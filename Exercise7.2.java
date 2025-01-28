import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a value for the square root: ");
        double x = in.nextDouble();
        System.out.println("Enter a value for the square root's guess: ");
        double guess = in.nextDouble();
        
        System.out.println("The approximate of x's Square root is: "+squareRoot(x,guess));
        System.out.println("The x's Square root is: "+Math.sqrt(x));
    }
    public static double squareRoot(double x,double guess){
        double result = (guess+x/guess)/2;
        return result;
    }
}