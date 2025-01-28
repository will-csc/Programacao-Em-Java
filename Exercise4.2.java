public class Main{
	public static void main(String[] args){
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}
	public static void zool(int number, String s1, String s2){
		System.out.println("\n" + s1 + " and " + s2 + " are going to be married for " + number);
	}
	public static void zoop(){
		baffle();
		System.out.print("You wugga ");
		baffle();
	}
	public static void baffle(){
		System.out.print("wug");
		ping();
	}
	public static void ping(){
		System.out.println(".");
		String name = "william";
		String name2 = "tamiles";
		int number = 25;

		zool(number,name,name2);
	}
}
// 1 = "No, I wug. You wugga wug.
// 	I wug."
//
// 2 = Drawed on the notebook
//
// 3 = We created an infinite loop
