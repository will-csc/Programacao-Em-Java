import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a range for random: ");
        int range = in.nextInt();
        System.out.println("Enter a size for the array: ");
        int size = in.nextInt();
        
        int[] a = RandomArray(range,size);
        DisplayArray(a);
        
        System.out.println("\n\nEnter a value in order to see if all of them are factors: ");
        int numb = in.nextInt();
        boolean bFactors = areFactors(numb,a);
        System.out.printf("\nThe numbers in the array are all factors of %d?: %b",numb,bFactors);
    }
    public static int[] RandomArray(int range,int size){
        Random random = new Random();
        int[] a = new int[size];
        
        for(int i = 0; i < size; i++){
            a[i] = random.nextInt(range);
        }
        
        return a;
    }
    public static void DisplayArray(int[] a){
        System.out.print("[");
        for(int value : a){
            System.out.printf("%d,",value);
        }
        System.out.print("]");
    }
    public static boolean areFactors(int n,int[] a){
        for(int value : a){
            if(value % n != 0){
                return false;
            }
        }
        return true;
    }
}