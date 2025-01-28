import java.util.Scanner;

public class main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("\nEnter an odd integer number: ");
		int n =  in.nextInt();
		System.out.printf("\nThe sum of all odd number from 0 to %d is: %d",n,oddsum(n));
	}
	public static int oddsum(int n){
		if(n <= 0){
			return 0;
		}
		if(n % 2 != 0){
			return n + oddsum(n-2);
		}
		return oddsum(n-1);
	}
}

