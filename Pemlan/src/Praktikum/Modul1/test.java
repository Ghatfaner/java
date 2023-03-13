package Praktikum.Modul1;
import java.util.Scanner;
public class test{
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    double[] inputSide = new double[2];
    for (int i = 0; i < inputSide.length; i++) {
      inputSide[i] = input.nextDouble();
    }

    LuasKelilingPersegi test = new LuasKelilingPersegi(inputSide[0], inputSide[1]);
  }
}