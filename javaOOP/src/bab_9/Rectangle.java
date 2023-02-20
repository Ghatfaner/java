package bab_9;

public class Rectangle {
  private double dWidth;
  private double dHeight;
  public double dArea;
  public double dPerimeter;
  Rectangle(double dWidth, double dHeight) {
    this.dWidth = dWidth;
    this.dHeight = dHeight;
    this.setAreaRectangle(dWidth, dHeight);
    this.setPerimeterRectangle(dWidth, dHeight);
  }
  private double setAreaRectangle(double dWidth, double dHeight) {
    return dArea = dWidth * dHeight;
  }
  private double setPerimeterRectangle(double dWidth, double dHeight) {
    return dPerimeter = 2 * (dWidth + dHeight);
  }
  public double getArea() {
    return dArea;
  }
  public double getPerimeter() {
    return dPerimeter;
  }
  public double getWidth() {
    return dWidth;
  }
  public double getHeight() {
    return dHeight;
  }
}
