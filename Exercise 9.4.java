public class Main{
    public static void main(String[] args){
        String text = "otto";
        
        //System.out.println(first(text)); Exercise 9.4.1
        //System.out.println(rest(text)); Exercise 9.4.1
        //System.out.println(length(text)); Exercise 9.4.1
        
        //printString(text); Exercise 9.4.2
        
        //printBackward(text); Exercise 9.4.3
        
        //String new_text = reverseString(text); Exercise 9.4.4
        
        System.out.printf("\nThe '%s' text is a palindrome?: %b",text,isPalindrome(text)); //Exercise 9.4.5
    }
    public static char first(String s) {
        return s.charAt(0);
    }
    public static String rest(String s) {
        return s.substring(1);
    }
    public static int length(String s) {
        return s.length();
    }
    public static void printString(String s){
        for(int i = 0; i < length(s); i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void printBackward(String s){
        for(int i = length(s); i > 0; i--){
            System.out.println(s.charAt(i-1));
        }
    }
    public static String reverseString(String s){
        char[] new_text = new char[s.length()];
    
        for (int i = 0; i < s.length(); i++) {
            new_text[i] = s.charAt(s.length() - 1 - i);
        }
        
        return new String(new_text);
    }
    public static boolean isPalindrome(String s) {
        if (length(s) <= 1) {
            return true;
        }
        
        if (s.charAt(0) != s.charAt(length(s) - 1)) {
            return false;
        }
        
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}