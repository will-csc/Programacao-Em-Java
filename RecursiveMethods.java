public class Main{
	public static void main(String[] args){
		int n = 10;
		countdown(n);
	}
	public static void countdown(int n){
		if(n == 0){
			System.out.println("Blastoff!");
		}else{
			System.out.println(n);
			countdown(n - 1);
		}
	}
}
