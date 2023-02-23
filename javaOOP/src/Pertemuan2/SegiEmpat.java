package Pertemuan2;

public class SegiEmpat {
  private int intPanjang;
  private int intLebar;
  public int intArea;

  public SegiEmpat() {
    intPanjang = 1;
    intLebar = 1;
  }

  public int getArea() {
    intArea = intPanjang * intLebar;
    return intArea;
  }
}
