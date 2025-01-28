import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String text = in.nextLine();
        System.out.printf("\nThe current word '%s' is doubloon?: %b",text,isDoubloon(text));
    }
    public static boolean isDoubloon(String s){
        s = s.toLowerCase();  
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    count++;
                }
            }
            if (count != 2) {
                return false;
            }
        }
        return true;  // Todos os caracteres passaram no teste
    }
}