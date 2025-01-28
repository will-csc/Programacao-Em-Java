import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Type the first number: ");
		n1 = in.nextInt();
		System.out.println("Type the second number: ");
		n2 = in.nextInt();

		isDivisible(n1,n2);
	}
	public static boolean isDivisible(int n, int m){
		if(n % m == 0){
			System.out.printf("\n%d is divisible by %d",n,m);
			return true;
		}else{
			System.out.printf("\n%d is not divisible by %d",n,m);
			return false;
		}
	}
}

		
