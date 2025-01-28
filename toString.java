import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a value: ");
		int num = in.nextInt();

		String str = Integer.toString(num);
		System.out.printf("\nThe value converted to string: %s",str);
	}
}
