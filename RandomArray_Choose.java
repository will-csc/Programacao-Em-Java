import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nEnter the array size: ");
        int size = in.nextInt();
        System.out.println("\nEnter the random range: ");
        int range = in.nextInt();
        
        int[] a = randomArray(size,range);
        for(int i = 0; i < a.length; i++){
            System.out.printf("\na[%d] = %d",i+1,a[i]);
        }
    }
    public static int[] randomArray(int size, int range){
        Random random = new Random();
        int[] a = new int[size];
        
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(range);
        }
        return a;
    }
}