package Praktikum.Modul1;
public class jenisBuku {
    String judulBuku;
    int tahunTerbit;
    int banyakPenulis;
    String[] namaNamaPenulis;
    jenisBuku() {

    }
    jenisBuku(String judulBuku, int tahunTerbit, int banyakPenulis, String[] namaNamaPenulis) {
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.banyakPenulis = banyakPenulis;
        this.namaNamaPenulis = namaNamaPenulis;
    }
    public void tampilInformasi() {
        System.out.println("Judul buku: " + judulBuku);
        System.out.println("Tahun terbit buku: " + tahunTerbit);
        System.out.print("Nama penulis buku: ");
        for(int i = 0; i<this.banyakPenulis; i++) {
            if(i == this.banyakPenulis-1) {
                System.out.println(this.namaNamaPenulis[i]);
                System.out.println();
                return;
            }
            System.out.print(this.namaNamaPenulis[i] + ", ");
        }
    }
}
