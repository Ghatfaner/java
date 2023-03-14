package Pemlan.Bab_10;

public class TestCircle2D {
  public static void main(String[] args) {

    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.printf("X Position\t\t\t: %.0f\n", c1.getX());
    System.out.printf("Y Position\t\t\t: %.0f\n", c1.getY());
    System.out.printf("Radius of the circle\t\t: %.1f\n", c1.getRadius());
    System.out.printf("Area\t\t\t\t: %.5f\n", c1.getArea());
    System.out.printf("Perimeter\t\t\t: %.5f\n", c1.getPerimeter());
    System.out.printf("Contains dot (3, 3)?\t\t: %b\n", c1.bContainsDot(3, 3));
    System.out.printf("Contains circle (4, 5, 10.5)?\t: %b\n", c1.bContains(new Circle2D(4, 5, 10.5)));
    System.out.printf("Overlaps circle (3, 5, 2.3)?\t: %b\n", c1.bOverlaps(new Circle2D(3, 5, 2.3)));
  }
}
