package Pertemuan;

public class Persegi {
  
  private int panjang;
  private int lebar;
  public int luas;
  public int keliling;

  Persegi(int panjang, int lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.setHitungKeliling(panjang, lebar);
    this.setHitungLuas(panjang, lebar);
  }
  private int setHitungLuas(int panjang, int lebar) {
    // panjang = 20;
    // lebar = 10;
    
    luas = panjang * lebar;
    return luas;
  }

  private int setHitungKeliling(int panjang, int lebar) {
    // panjang = 20;
    // lebar = 10;
    
    keliling = 2 * (panjang + lebar);
    return keliling;
  }

  public int getLuas() {
    return luas;
  }

  public int getKeliling() {
    return keliling;
  }
}
