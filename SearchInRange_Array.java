import java.util.Random;

public class Main{
	public static void main(String[] args){
		int[] scores = randomArray(30);
		int a = inRange((scores),90,100);
		System.out.printf("\nThe number of elements in range(90,100) are: %d",a);
		int b = inRange((scores),80,90);
		System.out.printf("\nThe number of elements in range(80,90) are: %d",b);
		int c = inRange((scores),70,80);
		System.out.printf("\nThe number of elements in range(70,80) are: %d",c);
		int d = inRange((scores),60,70);
		System.out.printf("\nThe number of elements in range(60,70) are: %d",d);
		int f = inRange((scores),0,60);
		System.out.printf("\nThe number of elements in range(0,60) are: %d",f);
	}
	public static int[] randomArray(int size){
		Random random = new Random();
		int[] a = new int[size];
		for(int i = 0; i < a.length; i++){
			a[i] = random.nextInt(100);
		}
		return a;
	}
	public static int inRange(int [] a, int low, int high){
		int count = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] >= low && a[i] < high){
				count++;
			}
		}
		return count;
	}
}
