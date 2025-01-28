import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("What's the value of the cathetus \"a\": ");
		double a = scanner.nextDouble();
		double a2 = a * a;

		System.out.println("What's the value of the cathetus \"b\": ");
		double b = scanner.nextDouble();
		double b2 = b * b;

		//--------- EXPRESSION FOR THE VALUE OF HYPOTENUSE -----------
		double h = Math.sqrt(b2 + a2);
		System.out.println("The value of the hypotenuse is: "+h);
	}
}
