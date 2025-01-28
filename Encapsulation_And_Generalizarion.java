import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int i = 1;
		while(i <= 10){
			printRow(i);
			i = i + 1;
		}
	}
	public static void printRow(int n){
		int i = 1;
		while(i <= 10){
			System.out.printf("%4d",n * i);
			i = i + 1;
		}
		System.out.println();
	}
}
