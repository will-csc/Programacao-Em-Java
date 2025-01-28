import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a text: ");
        String text = in.nextLine();
        
        reverseText(text);
    }
    public static void reverseText(String text){
        for(int i = text.length() -1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
    }
}