import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		int max = Integer.MIN_VALUE;

		System.out.printf("\nThe numbers entered through command line is: %s",Arrays.toString(args));
		for(String arg : args){
			int value = Integer.parseInt(arg);
			if(value > max){
				max = value;
			}
		}
		System.out.printf("\nThe maximmum value is: %d",max);
	}
}
