package bab_9;

public class TestTV {
  public static void main(String[] args) {
    
    TV tv1 = new TV();
    tv1.turnOn();
    tv1.setChannel(24);
    tv1.setVolume(3);
    tv1.volumeUp();
    tv1.channelUp();
    
    TV tv2 = new TV();
    tv2.turnOn();
    // tv1.setChannel(34);
    // tv1.setVolume(5);
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();

    System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);

    System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);

  }
}
