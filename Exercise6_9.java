import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("\nEnter the base value: ");
		int base = in.nextInt();
		System.out.println("\nEnter the power value: ");
		int power = in.nextInt();

		int result = PowerValue(base,power);
		System.out.printf("\nThe %d in the power of %d is: %d",base,power,result);
	}
	public static int PowerValue(int x,int n){
		if(n == 1){
			return x * n;
		}else if(n == 0){
			return 1;
		}
		return PowerValue(x,n-1) * x;
	}
}
