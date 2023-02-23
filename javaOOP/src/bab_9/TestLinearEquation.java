package bab_9;
import java.util.*;
public class TestLinearEquation {
  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);
    double[] insertValue = new double[6];
    for (int i = 0; i < insertValue.length; i++) {
      insertValue[i] = insert.nextDouble();
    }
    LinearEquation dValue = new LinearEquation(insertValue[0], insertValue[1], insertValue[2], insertValue[3],
        insertValue[4], insertValue[5]);

    System.out.println("Nilai A = " + dValue.getA());
    System.out.println("Nilai B = " + dValue.getB());
    System.out.println("Nilai C = " + dValue.getC());
    System.out.println("Nilai D = " + dValue.getD());
    System.out.println("Nilai E = " + dValue.getE());
    System.out.println("Nilai F = " + dValue.getF());
    System.out.println("Pembilang X = (ED - BF) = " + dValue.getPembilangX());
    System.out.println("Pembilang Y = (AF - CE) = " + dValue.getPembilangY());
    System.out.println("Penyebut = (AD - BC) = " + dValue.getPenyebut());
    System.out.println("Nilai X = (ED-BF)/(AD-BC) = " + dValue.getX());
    System.out.println("Nilai Y = (AF-CE)/(AD-BC) = " + dValue.getY());
    // System.out.println("Apakah dapat diselesaikan? " + dValue.isSolvable());
    if (dValue.isSolvable())
      System.out.println("The equation has no solution");
    else
      System.out.println("The equation has solution");

    insert.close();
  }
}
