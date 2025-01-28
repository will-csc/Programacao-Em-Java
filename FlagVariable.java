import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		boolean flag = true;
		String input;

		do{
			System.out.println("The flag result is true\nWould like to change the flag?: (y/n)");
			input = in.nextLine().trim();
			flag = (input.equals("n"));
		}while(flag);
	}
}
