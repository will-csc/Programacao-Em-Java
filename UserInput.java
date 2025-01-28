import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name?: ");
		String name = scanner.nextLine();

		System.out.println("How old are you?: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("What is your favorite food?: ");
		String food = scanner.nextLine();

		System.out.println("The input the system got were: ");
		System.out.println("Name: "+name+"\n"+"Age: "+age+"\nFavorite food: "+food);
	}
}
