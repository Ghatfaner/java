package Praktikum;
import java.util.Scanner;
public class JBMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah buku Teknologi: ");
        int ufu = input.nextInt();
        while(ufu<5) {
            System.out.println("jumlah buku teknologi minimal 5!");
            System.out.print("Jumlah buku Teknologi: ");
            ufu = input.nextInt();
        }
        input.nextLine();
        jenisBuku[] mmT = new jenisBuku[ufu];
        for (int i = 0; i < mmT.length; i++) {
            System.out.println();
            System.out.print("Judul buku teknologi ke-" +(i+1) + ": ");
            String judulBuku = input.nextLine();
            System.out.print("Tahun terbit buku teknologi ke-" +(i+1) + ": ");
            int tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.print("Jumlah penulis buku teknologi ke-" +(i+1) + ": ");
            int jp = input.nextInt();
            input.nextLine();
            mmT[i] = new jenisBuku(judulBuku, tahunTerbit, jp, new String[jp]);
            System.out.println();
            for (int j = 0; j < jp; j++) {
                System.out.print("Nama penulis ke-" + (j+1) + " buku teknologi ke-" + (i+1) + ": ");
                mmT[i].namaNamaPenulis[j] = input.nextLine();
            }
        }
        
        System.out.println();
        System.out.print("Jumlah buku Filsafat: ");
        ufu = input.nextInt();
        while(ufu<5) {
            System.out.println("jumlah buku filsafat minimal 5!");
            System.out.print("Jumlah buku Filsafat: ");
            ufu = input.nextInt();
        }
        input.nextLine();
        jenisBuku[] mmF = new jenisBuku[ufu];
        for (int i = 0; i < mmF.length; i++) {
            System.out.println();
            System.out.print("Judul buku filsafat ke-" +(i+1) + ": ");
            String judulBuku = input.nextLine();
            System.out.print("Tahun terbit buku filsafat ke-" +(i+1) + ": ");
            int tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.print("Jumlah penulis buku filsafat ke-" +(i+1) + ": ");
            int jp = input.nextInt();
            input.nextLine();
            mmF[i] = new jenisBuku(judulBuku, tahunTerbit, jp, new String[jp]);
            System.out.println();
            for (int j = 0; j < jp; j++) {
                System.out.print("Nama penulis ke-" + (j+1) + " buku filsafat ke-" + (i+1) + ": ");
                mmF[i].namaNamaPenulis[j] = input.nextLine();
            }
        }
        System.out.println();
        System.out.print("Jumlah buku Sejarah: ");
        ufu = input.nextInt();
        while(ufu<5) {
            System.out.println("jumlah buku sejarah minimal 5!");
            System.out.print("Jumlah buku Sejarah: ");
            ufu = input.nextInt();
        }
        input.nextLine();
        jenisBuku[] mmS = new jenisBuku[ufu];
        for (int i = 0; i < mmS.length; i++) {
            System.out.println();
            System.out.print("Judul buku sejarah ke-" +(i+1) + ": ");
            String judulBuku = input.nextLine();
            System.out.print("Tahun terbit buku sejarah ke-" +(i+1) + ": ");
            int tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.print("Jumlah penulis buku sejarah ke-" +(i+1) + ": ");
            int jp = input.nextInt();
            input.nextLine();
            mmS[i] = new jenisBuku(judulBuku, tahunTerbit, jp, new String[jp]);
            System.out.println();
            for (int j = 0; j < jp; j++) {
                System.out.print("Nama penulis ke-" + (j+1) + " buku sejarah ke-" + (i+1) + ": ");
                mmS[i].namaNamaPenulis[j] = input.nextLine();
            }
        }
        System.out.println();
        System.out.print("Jumlah buku Agama: ");
        ufu = input.nextInt();
        while(ufu<5) {
            System.out.println("jumlah buku agama minimal 5!");
            System.out.print("Jumlah buku Agama: ");
            ufu = input.nextInt();
        }
        input.nextLine();
        jenisBuku[] mmA = new jenisBuku[ufu];
        for (int i = 0; i < mmA.length; i++) {
            System.out.println();
            System.out.print("Judul buku agama ke-" +(i+1) + ": ");
            String judulBuku = input.nextLine();
            System.out.print("Tahun terbit buku agama ke-" +(i+1) + ": ");
            int tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.print("Jumlah penulis buku agama ke-" +(i+1) + ": ");
            int jp = input.nextInt();
            input.nextLine();
            mmA[i] = new jenisBuku(judulBuku, tahunTerbit, jp, new String[jp]);
            System.out.println();
            for (int j = 0; j < jp; j++) {
                System.out.print("Nama penulis ke-" + (j+1) + " buku agama ke-" + (i+1) + ": ");
                mmA[i].namaNamaPenulis[j] = input.nextLine();
            }
        }
        System.out.println();
        System.out.print("Jumlah buku Psikologi: ");
        ufu = input.nextInt();
        while(ufu<5) {
            System.out.println("jumlah buku psikologi minimal 5!");
            System.out.print("Jumlah buku Psikologi: ");
            ufu = input.nextInt();
        }
        input.nextLine();
        jenisBuku[] mmP = new jenisBuku[ufu];
        for (int i = 0; i < mmP.length; i++) {
            System.out.println();
            System.out.print("Judul buku psikologi ke-" +(i+1) + ": ");
            String judulBuku = input.nextLine();
            System.out.print("Tahun terbit buku psikologi ke-" +(i+1) + ": ");
            int tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.print("Jumlah penulis buku psikologi ke-" +(i+1) + ": ");
            int jp = input.nextInt();
            input.nextLine();
            mmP[i] = new jenisBuku(judulBuku, tahunTerbit, jp, new String[jp]);
            System.out.println();
            for (int j = 0; j < jp; j++) {
                System.out.print("Nama penulis ke-" + (j+1) + " buku psikologi ke-" + (i+1) + ": ");
                mmP[i].namaNamaPenulis[j] = input.nextLine();
            }
        }
        System.out.println();
        System.out.print("Jumlah buku Politik: ");
        ufu = input.nextInt();
        while(ufu<5) {
            System.out.println("jumlah buku politik minimal 5!");
            System.out.print("Jumlah buku Politik: ");
            ufu = input.nextInt();
        }
        input.nextLine();
        jenisBuku[] mmPo = new jenisBuku[ufu];
        for (int i = 0; i < mmPo.length; i++) {
            System.out.println();
            System.out.print("Judul buku politik ke-" +(i+1) + ": ");
            String judulBuku = input.nextLine();
            System.out.print("Tahun terbit buku politik ke-" +(i+1) + ": ");
            int tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.print("Jumlah penulis buku politik ke-" +(i+1) + ": ");
            int jp = input.nextInt();
            input.nextLine();
            mmPo[i] = new jenisBuku(judulBuku, tahunTerbit, jp, new String[jp]);
            System.out.println();
            for (int j = 0; j < jp; j++) {
                System.out.print("Nama penulis ke-" + (j+1) + " buku politik ke-" + (i+1) + ": ");
                mmPo[i].namaNamaPenulis[j] = input.nextLine();
            }
        }
        System.out.println();
        System.out.print("Jumlah buku Fiksi: ");
        ufu = input.nextInt();
        while(ufu<5) {
            System.out.println("jumlah buku fiksi minimal 5!");
            System.out.print("Jumlah buku Fiksi: ");
            ufu = input.nextInt();
        }
        input.nextLine();
        jenisBuku[] mmFi = new jenisBuku[ufu];
        for (int i = 0; i < mmFi.length; i++) {
            System.out.println();
            System.out.print("Judul buku fiksi ke-" +(i+1) + ": ");
            String judulBuku = input.nextLine();
            System.out.print("Tahun terbit buku fiksi ke-" +(i+1) + ": ");
            int tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.print("Jumlah penulis buku fiksi ke-" +(i+1) + ": ");
            int jp = input.nextInt();
            input.nextLine();
            mmFi[i] = new jenisBuku(judulBuku, tahunTerbit, jp, new String[jp]);
            System.out.println();
            for (int j = 0; j < jp; j++) {
                System.out.print("Nama penulis ke-" + (j+1) + " buku fiksi ke-" + (i+1) + ": ");
                mmFi[i].namaNamaPenulis[j] = input.nextLine();
            }
        }
        System.out.println();
        for (int i = 0; i < mmT.length; i++) {
            System.out.println("Jenis buku: Teknologi");
            System.out.println("Informasi buku Teknologi ke-" + (i+1) +": ");
            System.out.println();
            mmT[i].tampilInformasi();
        }
        for (int i = 0; i < mmF.length; i++) {
            System.out.println("Jenis buku: Filsafat");
            System.out.println("Informasi buku Filsafat ke-" + (i+1) +": ");
            System.out.println();
            mmF[i].tampilInformasi();
        }
        for (int i = 0; i < mmS.length; i++) {
            System.out.println("Jenis buku: Sejarah");
            System.out.println("Informasi buku Sejarah ke-" + (i+1) +": ");
            System.out.println();
            mmS[i].tampilInformasi();
        }
        for (int i = 0; i < mmA.length; i++) {
            System.out.println("Jenis buku: Agama");
            System.out.println("Informasi buku Agama ke-" + (i+1) +": ");
            System.out.println();
            mmA[i].tampilInformasi();
        }
        for (int i = 0; i < mmP.length; i++) {
            System.out.println("Jenis buku: Psikologi");
            System.out.println("Informasi buku Psikologi ke-" + (i+1) +": ");
            System.out.println();
            mmP[i].tampilInformasi();
        }
        for (int i = 0; i < mmPo.length; i++) {
            System.out.println("Jenis buku: Politik");
            System.out.println("Informasi buku Politik ke-" + (i+1) +": ");
            System.out.println();
            mmPo[i].tampilInformasi();
        }
        for (int i = 0; i < mmFi.length; i++) {
            System.out.println("Jenis buku: Fiksi");
            System.out.println("Informasi buku Fiksi ke-" + (i+1) +": ");
            System.out.println();
            mmFi[i].tampilInformasi();
        }
        input.close();
    }
}