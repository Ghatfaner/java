package bab_9;
public class LinearEquation {
   private double dA;
   private double dB;
   private double dC;
   private double dD;
   private double dE;
   private double dF;
   public double dPenyebut;
   public double dPembilangX;
   public double dPembilangY;
   public boolean bSolvabilty = true;

  LinearEquation(double dA, double dB, double dC, double dD, double dE, double dF) {
    this.dA = dA;
    this.dB = dB;
    this.dC = dC;
    this.dD = dD;
    this.dE = dE;
    this.dF = dF;
    this.setHitungPenyebut(dA, dB, dC, dD);
    this.setHitungPembilangX(dB, dD, dE, dF);
    this.setHitungPembilangY(dA, dD, dE, dF);
    this.canNotBeSolved();
  }

  private double setHitungPenyebut(double dA, double dB, double dC, double dD) {
    dPenyebut = ((dA * dD) - (dB * dC));
    return dPenyebut;
  }
  private double setHitungPembilangX(double dB, double inD, double dE, double dF) {
    dPembilangX = ((dE * dD) - (dB * dF));
    return dPembilangX;
  }
  private double setHitungPembilangY(double dA, double inC, double dE, double dF) {
    dPembilangY = ((dA * dF) - (dC * dE));
    return dPembilangY;
  }
  public double getA() {
    return dA;
  }
  public double getB() {
    return dB;
  }
  public double getC() {
    return dC;
  }
  public double getD() {
    return dD;
  }
  public double getE() {
    return dE;
  }
  public double getF() {
    return dF;
  }
  public double getPembilangX() {
    return dPembilangX;
  }
  public double getPembilangY() {
    return dPembilangY;
  }
  public double getX() {
    return dPembilangX/dPenyebut;
  }
  public double getY() {
    return dPembilangY/dPenyebut;
  }
  public double getPenyebut() {
    return dPenyebut;
  }
  private void canNotBeSolved() {
    if(dPenyebut == 0)
      bSolvabilty = false;
    else
      bSolvabilty = true;
  }
  public boolean isSolvable() {
    return bSolvabilty;
  }
}

