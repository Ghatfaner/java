package Pemlan.Bab_10;

public class TestCircle2D {
  public static void main(String[] args) {
    
    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.printf("Area\t\t\t\t\t: %.5f\n", c1.getArea());
    System.out.printf("Perimeter\t\t\t\t: %.5f\n", c1.getPerimeter());
    System.out.printf("Contains (3, 3)?\t\t\t: %b\n", c1.bContains(3, 3));
    System.out.printf("Contains circle (4, 5, 10.5)?\t\t: %b\n", c1.bContains(new Circle2D(4, 5, 10.5)));
    System.out.printf("Contains circle (4, 5, 10.5)?\t\t: %b\n", c1.bOverlaps(new Circle2D(3, 5, 2.3)));
  }
}
