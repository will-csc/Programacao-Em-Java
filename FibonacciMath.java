import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nType a value for the fibonacci sequence: ");
		int x = in.nextInt();
		System.out.printf("\nThe value for fibonacci(%d) is: %d",x,fibonacci(x));
	}
	public static int fibonacci(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}

