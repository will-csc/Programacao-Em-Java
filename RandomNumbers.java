import java.util.Random;

public class Main{
	public static void main(String[] args){

		Random random = new Random();

		int x = random.nextInt(10);
		System.out.println("The integer generated was: "+x);
		float z = random.nextFloat(10);
		System.out.println("The float generated was: "+z);
	}
}
