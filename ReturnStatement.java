public class Main{
	public static void main(String[] args){
		double x = 50.6;
		printLogarithm(x);
	}
	public static void printLogarithm(double x){
		if(x <= 0.0){
			System.out.println("Error: x must be positive.");
			return;
		}
		double result = Math.log(x);
		System.out.println("The log of x is: "+result);
	}
}
