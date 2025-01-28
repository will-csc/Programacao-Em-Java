import java.awt.Point; //Point is used like the coordinates in a
                       //Cartesian plan

public class Main{
    public static void main(String[] args){
        Point blank = new Point(3,4);
        printPoint(blank);
        
        System.out.println("\nValue of 'x': "+blank.x);
        System.out.println("Value of 'y': "+blank.y);
        
        int sum = blank.x + blank.y;
        System.out.println("Sum of 'x' + 'y': "+sum);
    }
    public static void printPoint(Point p){
        System.out.printf("\n(x:%d,y:%d)",p.x,p.y);
    }
}
