public class Main{
	public static void main(String[] args){
		int n = 10;
		nLines(n);
	}
	public static void nLines(int n){
		if(n > 0){
			System.out.println();
			nLines(n - 1);
		}
	}
}
