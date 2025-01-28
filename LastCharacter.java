public class Main{
    public static void main(String[] args){
        String text = "Computer Science is fun!";
        
        int length = text.length();
        char last = text.charAt(length-1);
        System.out.printf("The last character in the text is: %c",last);
    }
}