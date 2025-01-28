import java.util.Random;
import java.util.Scanner;

public class Main{
        public static void main(String[] args){
		Scanner in = new Scanner(System.in);
                Random random = new Random();

		int z,x;
		
		do{
			System.out.println("\nWhat's your guess? (1-10): ");
			z = in.nextInt();

			x = random.nextInt(10);
			System.out.println("\nThe integer generated was: "+x);
		}while(x != z);
        }
}
