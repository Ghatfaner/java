package toString;

public class main {
  public static void main(String[] args) {
    
    // toString() = special method that all objects inherit, that returns a String that "textually represent" an object. can be use both implicity and explicity

    Boat boat = new Boat();

    // output one by one = too long
    System.out.println(boat.brand);
    System.out.println(boat.model);
    System.out.println(boat.color);
    System.out.println(boat.year);
    System.out.println(boat.price);
    
    // output = address
    System.out.println("\n"+boat); // after added toDtring() method its no longer print address

    // also can be use on this
    System.out.println("\n"+boat.toString());


  }
}
