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
        
        System.out.println("\nEnter the start index for array: ");
        int lowIndex = in.nextInt();
        System.out.println("Enter the end index for array: ");
        int Highindex = in.nextInt();
        int maximmum_value = maxInRange(a,lowIndex,Highindex);
        System.out.println("The maximmum value found is: "+maximmum_value);
    }
    public static int maxInRange(int[] a,int lowIndex,int highIndex){
        if (lowIndex == highIndex) {
            return a[lowIndex];
        }
        
        int midIndex = (lowIndex + highIndex) / 2;
        
        int maxLeft = maxInRange(a, lowIndex, midIndex);
        int maxRight = maxInRange(a, midIndex + 1, highIndex);
        
        return Math.max(maxLeft, maxRight);
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
}
