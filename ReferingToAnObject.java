import java.awt.Rectangle; //Rectangle objects are similar to points,
                          //but they have four attributes: x, y,
                         //width, and height.
public class Main{
    public static void main(String[] args){
        Rectangle box = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box; // Here i am refering to the variable "box"
                              // Not copying its values
        
        System.out.println("The value of 'box.x' before changing 'box2.x': "+box.x);
        box2.x = 2;
        System.out.println("The value of 'box.x' after changing 'box2.x': "+box.x);
    }
}
