import java.awt.Point; //Point is used like the coordinates in a
                       //Cartesian plan

public class Main{
    public static void main(String[] args){
        Point blank = new Point(4,3);
        Point blank2 = new Point(5,3);
        //printPoint(blank);
        //System.out.println(blank);
        
        //System.out.println("\nValue of 'x': "+blank.x);
        //System.out.println("Value of 'y': "+blank.y);
        
        //int sum = blank.x + blank.y;
        //System.out.println("Sum of 'x' + 'y': "+sum);
        double distance = distancefrom(blank,blank2);
        System.out.println("The distance from blank to blank2 is: "+distance);
    }
    public static void printPoint(Point p){
        System.out.printf("\n(x:%d,y:%d)",p.x,p.y);
    }
    public static double distancefrom(Point p1,Point p2){
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
