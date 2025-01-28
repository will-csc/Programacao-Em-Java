import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nType a number: ");
		int x = in.nextInt();

		if(x > 0 && x < 10){
			System.out.println("Positive single digit number");
		}
	}
}
