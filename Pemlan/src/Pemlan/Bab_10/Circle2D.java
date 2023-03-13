package Pemlan.Bab_10;

public class Circle2D {

  private double dX;
  private double dY;
  private double dRadius;
  private double dArea;
  private double dPerimeter;
  
  private Circle2D() {
    this(0, 0, 1);
  }

  public Circle2D(double dX, double dY, double dRadius) {
    this.dX = dX;
    this.dY = dY;
    this.dRadius = dRadius;
    this.setArea(dRadius);
    this.setPerimeter(dRadius);
  }

  private double setArea(double dRadius) {
    dArea = Math.PI * dRadius * dRadius;
    return dArea;
  }

  private double setPerimeter(double dRadius) {
    dPerimeter = 2 * Math.PI * dRadius;
    return dPerimeter;
  }

  public double getArea() {
    return dArea;
  }

  public double getPerimeter() {
    return dPerimeter;
  }

  public boolean bContains(double dX, double dY) {
    return Math.sqrt((Math.pow(dX - this.dX, 2)) + (Math.pow(dY - this.dY, 2))) < dRadius;
  }

  public boolean bContains(Circle2D circle) {
    return Math.sqrt((Math.pow(circle.dX - dX, 2)) + (Math.pow(circle.dY - dY, 2))) + circle.dRadius < dRadius;
  }

  public boolean bOverlaps(Circle2D circle) {
    return Math.sqrt((Math.pow(circle.dX - dX, 2)) + (Math.pow(circle.dY - dY, 2))) < dRadius + circle.dRadius;
  }

}
