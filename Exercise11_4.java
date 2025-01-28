import java.util.Scanner;

public class Exercise11_4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("\nEnter a day,month and year");
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();

		Date birthday = new Date();
		System.out.println("The class variable: "+birthday);
//		birthday.Date(year,month,day);
//		System.out.println("The class variable: "+birthday);
	}
}
