package Praktikum.Modul1;

public class MainMobil {
  public static void main(String[] args) {

    Mobil mobil1 = new Mobil();
    mobil1.setKecepatan(50);
    mobil1.setManufaktur("Toyota");
    mobil1.setNoPlat("AB 1234 UA");
    mobil1.setWarna("Hitam");
    mobil1.displayMessage();
    System.out.println("======================");
    Mobil mobil2 = new Mobil();
    mobil1.setKecepatan(150);
    mobil1.setManufaktur("BMW");
    mobil1.setNoPlat("N 2785 AB");
    mobil1.setWarna("Silver");
    mobil1.displayMessage();
    System.out.println("======================");
    System.out.print("Mobil pada mobil1 akan diubah warnanya menjadi Hijau");
    mobil1.setWarna("Hijau");
    mobil1.displayMessage();
  }
}
