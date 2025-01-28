import java.awt.Rectangle; //Rectangle objects are similar to points,
                          //but they have four attributes: x, y,
                         //width, and height.
import java.awt.Point;

public class Main{
    public static void main(String[] args){
        Rectangle box = new Rectangle(0, 0, 100, 200);
        Point center = findCenter(box);
        System.out.println("The center of the box is: "+center);
    }
    public static Point findCenter(Rectangle box){
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x,y);
    }
}
