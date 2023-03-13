package Praktikum.Modul2;
import java.util.Scanner;
public class TestPeternak {
  public static void main(String[] args) {
    String[] szHewan = {"Bebek", "Domba", "Unta"};
    int[] intJumlah = {25, 10, 7};
    int[] intHasil = {2, 4, 5};
    int[] intTotalHarian = {50, 40, 35};
    double[] dHasilBooster = new double[intHasil.length];
    double[] dHasilBoosterHarian = new double[intHasil.length];
    
    Peternak ternak = new Peternak(szHewan, intHasil, intJumlah, intTotalHarian, dHasilBooster, dHasilBoosterHarian);

    System.out.printf("\nJenis\t\t\t: %s", ternak.getHewan()[0]);
    System.out.printf("\nJumlah\t\t\t: %d ekor", ternak.getJumlah()[0]);
    System.out.printf("\nTelur/Ekor\t\t: %d butir",ternak.getHasil()[0]);
    System.out.printf("\nTelur/Ekor\t\t: %.0f butir (Setelah Booster)", ternak.getHasilBooster()[0]);
    System.out.printf("\nTotal Telur/Hari\t: %d butir", ternak.getTotalHarian()[0]);
    System.out.printf("\nTotal Telur/Hari\t: %.0f butir (Setelah Booster)", ternak.getHasilBoosterHarian()[0]);

    System.out.printf("\n============================================================");

    System.out.printf("\nJenis\t\t\t: %s", ternak.getHewan()[1]);
    System.out.printf("\nJumlah\t\t\t: %d ekor", ternak.getJumlah()[1]);
    System.out.printf("\nBulu/Ekor\t\t: %d kg",ternak.getHasil()[1]);
    System.out.printf("\nBulu/Ekor\t\t: %.0f kg (Setelah Booster)", ternak.getHasilBooster()[1]);
    System.out.printf("\nTotal Bulu/Hari\t\t: %d kg", ternak.getTotalHarian()[1]);
    System.out.printf("\nTotal Bulu/Hari\t\t: %.0f kg (Setelah Booster)", ternak.getHasilBoosterHarian()[1]);

    System.out.printf("\n============================================================");

    System.out.printf("\nJenis\t\t\t: %s", ternak.getHewan()[2]);
    System.out.printf("\nJumlah\t\t\t: %d ekor", ternak.getJumlah()[2]);
    System.out.printf("\nSusu/Ekor\t\t: %d liter",ternak.getHasil()[2]);
    System.out.printf("\nSusu/Ekor\t\t: %.0f liter (Setelah Booster)", ternak.getHasilBooster()[2]);
    System.out.printf("\nTotal Susu/Hari\t\t: %d liter", ternak.getTotalHarian()[2]);
    System.out.printf("\nTotal Susu/Hari\t\t: %.0f liter (Setelah Booster)", ternak.getHasilBoosterHarian()[2]);

    System.out.printf("\n============================================================");
  }
}
