import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("What's the value for the abs value: ");
		int x = in.nextInt();
		
		int z = absoluteValue(x);
		System.out.println("The abs value is : "+z);
	}
	public static int absoluteValue(int x){
		if(x < 0){
			return -x;
		}else{
			return x;
		}
	}
}
