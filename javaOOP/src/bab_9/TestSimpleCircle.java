package bab_9;

import java.util.*;

public class TestSimpleCircle {
  public static void main(String[] args) {
    
    Scanner circle = new Scanner(System.in);
    double[] radiusess = new double[3];
    for (int i = 0; i < radiusess.length; i++) {
      System.out.printf("your radius of %d circle = ", i+1);
      radiusess[i] = circle.nextDouble();
    }
    
    SimpleCircle circle1 = new SimpleCircle(radiusess[0]);
    System.out.println("The area of the circle of radius = "+circle1.radius + " is "+circle1.getArea());

    SimpleCircle circle2 = new SimpleCircle(radiusess[1]);
    System.out.println("The area of the circle of radius = "+circle2.radius + " is "+circle2.getArea());

    SimpleCircle circle3 = new SimpleCircle(radiusess[2]);
    System.out.println("The area of the circle of radius = "+circle3.radius + " is "+circle3.getArea());
  }
}

class SimpleCircle {
  double radius;

  SimpleCircle(double[] radiusess) {
    for (int i = 0; i < radiusess.length; i++) {
      radius = radiusess[i];
    }
  }

  SimpleCircle(double newRadius) {
    radius = newRadius;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }

  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  void setRadius(double newRadius) {
    radius = newRadius;
  }


}