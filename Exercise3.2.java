import java.util.Scanner;

public class Converter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Type the value in celsius: ");
		float Cel = in.nextFloat();

		float Fahre = (Cel * 9/5) + 32;
		System.out.println("\nThe result converted is:");
		System.out.printf("%.2f C = %.2f F",Cel,Fahre);
	}
}
