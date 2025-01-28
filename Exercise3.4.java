import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber{
	public static void main(String[] args){
		Random random = new Random();
		Scanner in = new Scanner(System.in);

		int rand_int = random.nextInt(100);

		System.out.println("I'm thinking a number between 1 and 100 (Including both). \nCan you guess what it is?:");
		int GuessNumber = in.nextInt();

		if(rand_int == GuessNumber){
			System.out.println("\nYou are correct!");
		}else{
			System.out.printf("\nThe number I was thinking of was: %d\n",rand_int);
			
			int Offby = (rand_int - GuessNumber);
			System.out.printf("Your guess was off by: %d",Offby);
		}
	}
}
