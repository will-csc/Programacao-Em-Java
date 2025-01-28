import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a text: ");
        String text = in.nextLine();
        
        System.out.println("Enter a letter for index search: ");
        String letter = in.next();
        char caractere = letter.charAt(0);
        
        int index = text.indexOf(caractere);
        System.out.printf("\nIndex of '%c' is: %d",caractere,index);
    }
}