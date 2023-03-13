package Pemlan.Bab_10;

public class Divisible5or6 {

  Divisible5or6(long longMaxLong, long longNumber, int intCount) {
    while(intCount < 10) {
      if (longNumber % 5 == 0 || longNumber %6 == 0){
        System.out.println(longNumber);
        intCount++;
      }
      longNumber++;
    }
  }
}

class test {
  public static void main(String[] args) {
    Divisible5or6 divisible = new Divisible5or6(Long.MAX_VALUE, Long.MAX_VALUE + 1, 0);
    System.out.println(divisible);
  }
}
