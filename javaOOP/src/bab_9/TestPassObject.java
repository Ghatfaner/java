package bab_9;

public class TestPassObject {
  public static void main(String[] args) {
    
    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

    int intTotal = 5;
    printAreas(myCircle, intTotal);

  }

  public static void printAreas(CircleWithPrivateDataFields c, int intTimes) {
    System.out.println("Radius \t\tArea");
    while (intTimes >= 1 ) {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
      intTimes--;
    }
  }
}
