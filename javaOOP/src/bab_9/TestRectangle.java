package bab_9;
import java.util.*;
public class TestRectangle {
  public static void main(String[] args) {
    Scanner rectangle = new Scanner(System.in);
    
    int intWidth = rectangle.nextInt();
    int intHeight = rectangle.nextInt();
    Rectangle rectangle1 = new Rectangle(intWidth,intHeight);
    Rectangle rectangle2 = new Rectangle(3.5,35.9);

    System.out.println(rectangle1.getWidth());
    System.out.println(rectangle1.getHeight());
    System.out.println(rectangle1.getArea());
    System.out.println(rectangle1.getPerimeter());
    
    System.out.println();
    System.out.println(rectangle2.getWidth());
    System.out.println(rectangle2.getHeight());
    System.out.println(rectangle2.getArea());
    System.out.println(rectangle2.getPerimeter());

    rectangle.close();
  }
}
