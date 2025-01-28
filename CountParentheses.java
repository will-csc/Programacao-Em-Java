public class Main{
    public static void main(String[] args){
        String s = "((3 + 7) * 2)";
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                count++;
            }else if(c == ')'){
                count--;
            }
        }
        
        switch (count) {
            case 0:
                System.out.println("\nIt's ok with parentheses!");
                break; 
            default: 
                System.out.println("\nReview the parentheses!");
        }
    }
}