package Pertemuan2;

public class Constructor {
  static int intNewPanjang = 100;
  public static void main(String[] args) {
    
    SegiEmpat objek1 = new SegiEmpat();
    System.out.println(objek1.getArea());
    cetakBil();
  }

  public static void cetakBil() {
    int intNewPanjang = 10000;
    System.out.println("this is the NewPanjang = " + intNewPanjang);
    int jumlahNewPanjang = intNewPanjang + Constructor.intNewPanjang;
    System.out.println(jumlahNewPanjang);
  }
}

class segiempat {
  
}
