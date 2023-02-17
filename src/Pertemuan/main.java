package Pertemuan;
import java.util.*;
public class main {
  public static void main(String[] args) {
    Scanner masukkan = new Scanner(System.in);
    System.out.println("Tuliskan panjang persegi yang anda inginkan");
    int intPanjang = masukkan.nextInt();
    System.out.println("Tuliskan lebar persegi yang anda inginkan");
    int intLebar = masukkan.nextInt();
    Persegi persegi1 = new Persegi(intPanjang,intLebar);
    Human human1 = new Human();
    human1.setIdentitas("Ghatfan", 21);

    float fBilangan = 1 / 3f;

    // dilarang membandingkan dengan floating-point
    // metode ketelitian banyaknya bilangan float
    if (fBilangan == 0.33333333333333333f)
      System.out.println("bilangan dikenali");
    else
      System.out.println("ngga ada");

    if ((int) (fBilangan * 1000) == 333)
      System.out.println("bilangan dikenali");
    else
      System.out.println("ngga ada");

    System.out.println("nilainya adalah " + Math.round(fBilangan));

    System.out.println("Luas dari persegi adalah " + persegi1.getLuas());

    System.out.println("Keliling dari persegi adalah " + persegi1.getKeliling());
  }
}
