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
