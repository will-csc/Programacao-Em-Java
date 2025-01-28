import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		int[] b = Arrays.copyOf(a,a.length);

		for(int i = 0; i < a.length; i++){
			System.out.printf("\nThe 'b[%d]' has the value of: %d",i,b[i]);
		}
	}
}
