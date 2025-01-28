import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type the radius of the circle?: ");
		double radius = in.nextDouble();
		double area = calculateArea(radius);

		System.out.println("The total area is: "+area);
	}
	public static double calculateArea(double radius){
		double result = Math.PI * Math.pow(radius,2);
		return result;
	}
}

