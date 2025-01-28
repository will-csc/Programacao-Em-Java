import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String name1 = "acdefg";
        String name2 = "acdegf";
        int diff = name1.compareTo(name2);
        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.println("name1 comes before name2.");
        } else if (diff > 0) {
            System.out.println("name2 comes before name1.");
        }
    }
}