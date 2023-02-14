package hashObject;

public class main {
  public static void main(String[] args) {
    
    Garage garage = new Garage();

    Motor motor1 = new Motor("Harley Davidson");
    Motor motor2 = new Motor("Yamaha");

    garage.park(motor1);
    garage.park(motor2);
  }
}
