import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		double[] a = {1.5,1.2,3.4};

		System.out.println("\nEnter a value for searching: ");
		double n_search = in.nextDouble();

		System.out.printf("The return have been: %d",search(a,n_search));
	}
	public static int search(double[] a, double target){
		for(int i = 0; i < a.length; i++){
			if(a[i] == target){
				return i;
			}
		}
		return 0;
	}
}
