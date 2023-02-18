package bab_9;

import java.util.*;

public class TestLinearEquation {
  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);
    double[] insertValue = new double[6];
    for (int i = 0; i < insertValue.length; i++) {
      insertValue[i] = insert.nextDouble();
    }
    LinearEquation intValue = new LinearEquation(insertValue[0], insertValue[1], insertValue[2],insertValue[3],
    insertValue[4], insertValue[5]);
    
    System.out.println("Nilai A = " + intValue.getA());
    System.out.println("Nilai B = " + intValue.getB());
    System.out.println("Nilai C = " + intValue.getC());
    System.out.println("Nilai D = " + intValue.getD());
    System.out.println("Nilai E = " + intValue.getE());
    System.out.println("Nilai F = " + intValue.getF());
    System.out.println("Pembilang X = (ED - BF) = " + intValue.getPembilangX());
    System.out.println("Pembilang Y = (AF - CE) = " + intValue.getPembilangY());
    System.out.println("Penyebut = (AD - BC) = " + intValue.getPenyebut());
    System.out.println("Nilai X = (ED-BF)/(AD-BC) = " + intValue.getX());
    System.out.println("Nilai Y = (AF-CE)/(AD-BC) = " + intValue.getY());
    System.out.println("Apakah dapat diselesaikan? " + intValue.isSolvable());
    
    // System.out.println();
    // System.out.println(intValue2.getA());
    // System.out.println(intValue2.getB());
    // System.out.println(intValue2.getC());
    // System.out.println(intValue2.getD());
    // System.out.println(intValue2.getE());
    // System.out.println(intValue2.getF());
    // System.out.println(intValue2.intPenyebut);
    // System.out.println(intValue2.getX());
    // System.out.println(intValue2.isSolvable());
  }
}
