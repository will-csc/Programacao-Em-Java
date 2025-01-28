public class Main{
    public static void main(String[] args){
        String text = "Computer Science is fun!";
        
        for(int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            System.out.print(letter);
        }
    }
}