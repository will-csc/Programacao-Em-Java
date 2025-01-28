import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String text = in.nextLine();
        System.out.println("Enter another text:");
        String text2 = in.nextLine();
        
        System.out.printf("\n\nThe current word '%s' and '%s' are anagrams?: %b",text,text2,isAnagram(text,text2));
    }
    public static boolean isAnagram(String s,String d){
        if(s.length() != d.length()){
            return false;
        }
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = s.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }
}