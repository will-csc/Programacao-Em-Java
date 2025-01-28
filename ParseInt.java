import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a value: ");
		String str = in.nextLine();

		int num = Integer.parseInt(str);
		System.out.printf("\nThe value converted: %d",num);
	}
}
