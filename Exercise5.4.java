import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Type the value of the letter's in the \"Fermat's Last Theorem\" (a^n + b^n = c^n)\n\n");


		System.out.println("Type the value of 'a': ");
		int a = in.nextInt();

		System.out.println("Type the value of 'b': ");
		int b = in.nextInt();

		System.out.println("Type the value of 'c': ");
		int c = in.nextInt();

		System.out.println("Type the value of 'n': ");
		int n = in.nextInt();
		
		checkFermat(a,b,c,n);
	}
	public static void checkFermat(int a, int b, int c, int n){
		if(n > 2 && (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))){
			System.out.println("Holy smokes, Fermat was wrong!.");
		}else{
			System.out.println("No, that doesn't work.");
		}
	}
}
