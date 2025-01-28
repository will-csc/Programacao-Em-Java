import java.util.Scanner;

public class Squareroot{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type a number to get the square root: ");
		float number = (float) in.nextInt();
		double sqrt_number = Math.sqrt(number);

		System.out.printf("\nThe square root of %.2f is: %.2f",number,sqrt_number);
	}
}
