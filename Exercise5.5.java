import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("What's the value for the \"99 Bottle of Beer\"?: ");
		int beers = in.nextInt();
		System.out.println();
		Song(beers);
	}
	public static void Song(int n){
		String verseone = " bottles of beer on the wall,";
		String versetwo = " bottles of beer,";
		String versethree = "ya' take one down, ya' pass it around,";
		if(n == 0){
			System.out.println("No "+verseone);
			System.out.println("no "+versetwo);
			System.out.println(versethree);
			System.out.println("'cause there no more bottles of beer on the wall!");
		}else{
			System.out.println(n+verseone);
			System.out.println(n+versetwo);
			System.out.println(versethree);
			System.out.println((n-1)+verseone);
			System.out.println();
			Song(n-1);
		}
	}
}

