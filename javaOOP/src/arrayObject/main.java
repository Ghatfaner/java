package arrayObject;

public class main {
  public static void main(String[] args) {
    // Snack[] market = new Snack[4];
    // add elements one by one

    Snack market1 = new Snack("Taro"); 
    Snack market2 = new Snack("Qtela"); 
    Snack market3 = new Snack("Cheetos"); 
    Snack market4 = new Snack("Komo"); 

    // add elements in array with one single write
    Snack[] market = {market1, market2, market3, market4};

    System.out.println(market[0].name);
    System.out.println(market[1].name);
    System.out.println(market[2].name);
    System.out.println(market[3].name);

    
    System.out.println();
    
  }
}
