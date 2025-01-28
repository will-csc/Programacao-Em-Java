import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String text = in.nextLine();
        System.out.printf("\nThe current word '%s' is abecedarian?: %b",text,isAbecedarian(text));
    }
    public static boolean isAbecedarian(String s){
        if(s.length() < 2){
            return false;
        }else if(s.charAt(1) == s.charAt(0) + 1){
            return true;
        }
        return isAbecedarian(s.substring(1));
    }
}