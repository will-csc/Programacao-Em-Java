import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		double a,b,c;

		System.out.println("Enter the value for 'a': ");
		a = in.nextDouble();
		System.out.println("Enter the value for 'b': ");
		b = in.nextDouble();
		System.out.println("Enter the value for 'c': ");
		c = in.nextDouble();
		
		System.out.printf("The \"MultAdd\" functions has returned the value of: %.2f",multadd(a,b,c));
	}
	public static double multadd(double a,double b,double c){
		return a * b + c;
	}
}
