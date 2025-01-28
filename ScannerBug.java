import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int age;
		String name;

		System.out.print("What is your age?: ");
		age = in.nextInt();
		System.out.print("What is your name?: ");
		name = in.nextLine();
		System.out.printf("Hello %s, age %d\n", name, age);
	}
}
