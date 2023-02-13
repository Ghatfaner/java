package constructor;

public class main{
  public static void main(String[] args) {
    
    Car car = new Car("Chevrolet","Camaro","black",2021);

    System.out.println("this is my "+car.brand+" car");
    System.out.println("the model is "+car.model);
    System.out.println("the color is "+car.color);
  }
}