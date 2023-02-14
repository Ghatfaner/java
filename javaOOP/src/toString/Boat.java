package toString;

public class Boat {

  String brand = "Mako";
  String model = "pro";
  String color = "silver";
  int year = 2019;
  double price = 25000.00;

  public String toString() {
    String myString = brand + "\n" + model + "\n" + color + "\n" + year + "\n" + price;
    return myString;
  }
}
