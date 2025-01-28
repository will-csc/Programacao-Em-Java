import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("\nType a number to get his fatorial: ");
		int n = in.nextInt();
		System.out.printf("\nThe recursive of '%d' is: %d",n,RecursiveFatorial(n));
	}
	public static int RecursiveFatorial(int n){
		if(n == 1){
			return n;
		}else{
			return RecursiveFatorial(n - 1) * n;
		}
	}
}
