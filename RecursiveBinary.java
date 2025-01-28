public class Main{
	public static void main(String[] args){
		int x = 10;
		displayBinary(x);
	}
	public static void displayBinary(int value){
		if(value > 0){
			displayBinary(value / 2);
			System.out.print(value % 2);
		}
	}
}
