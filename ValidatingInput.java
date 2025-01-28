import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double x = 40.5;

		scanDouble(in);
	}
	public static void scanDouble(Scanner in){
		System.out.print("Enter a number: ");
		double x = in.nextDouble();
		printLogarithm(x);
	}
	public static void printLogarithm(double x){
                if(x <= 0.0){
                        System.out.println("Error: x must be positive.");
                        return;
                }
                double result = Math.log(x);
                System.out.println("The log of x is: "+result);
        }
}
