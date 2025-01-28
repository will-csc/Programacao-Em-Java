import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int inch;
        double cm;
        final double cmPerInch = 2.54;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many inches? ");
        inch = in.nextInt();
        
        cm = inch * cmPerInch;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
    }
}