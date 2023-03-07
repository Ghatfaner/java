package bab_9;

public class test{
  public static void main(String[] args) {
    
    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
    printCircle(myCircle);
  }
  public static void printCircle(CircleWithPrivateDataFields c) {
    System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
  }
}