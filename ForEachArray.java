import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nEnter a size value for the array: ");
        int size = in.nextInt();
        System.out.println("\nEnter the range value for the array: ");
        int range = in.nextInt();
        
        int[] a = randomArray(size,range);
        int i = 0;
        for(int value: a){
            System.out.printf("\n'a[%d]' = %d",i,value);
            i++;
        }
    }
    public static int[] randomArray(int size,int range){
        Random random = new Random();
        int a[] = new int[size];
        
        for(int i = 0; i < size; i++){
            a[i] = random.nextInt(range);
        }
        return a;
    }
}