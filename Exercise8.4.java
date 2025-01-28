import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a 10 values for the array: ");
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        System.out.printf("The maximmum value for the 'a' array is: %d",indexOfMax(a));
    }
    public static int indexOfMax(int[] a){
        int high = 0;
        for(int value : a){
            if (value > high){
                high = value;
            }
        }
        return high;
    }
}