import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nType the value for check if it is single digit: ");
		int value = in.nextInt();
		System.out.printf("\nThe value (%d) is single digit?: %b",value,isSingleDigit(value));
	}
	public static boolean isSingleDigit(int x){
		if(x > -10 && x < 10){
			return true;
		}else{
			return false;
		}
	}
}
		
