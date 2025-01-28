import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int side1,side2,side3;
		
		System.out.println("\nEnter the side 1: ");
		side1 = in.nextInt();	
		System.out.println("\nEnter the side 2: ");
		side2 = in.nextInt();
		System.out.println("\nEnter the side 3: ");
		side3 = in.nextInt();
		
		isTriangle(side1,side2,side3);
	}
	public static boolean isTriangle(int x,int y,int z){
		boolean result = !((x + y < z) || (x + z < y) || (y + z < x));
		System.out.printf("\nThe sides is a Triangle?: %b",result);
		return result;
	}
}

