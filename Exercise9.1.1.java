public class Main{
	public static void main(String[] args){
		System.out.println("\nThe result summing is: ");
		
		int sum = 0;
		for(String value : args){
			sum += Integer.parseInt(value);
		}
		System.out.println(sum);
	}
}
