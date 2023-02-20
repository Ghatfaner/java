package bab_9;
import java.util.*;
public class GregorianCalender {
  public static void main(String[] args) {
    GregorianCalendar calender = new GregorianCalendar();
    System.out.printf("%d/%d/%d", calender.get(GregorianCalendar.YEAR), calender.get(GregorianCalendar.MONTH) + 1, calender.get(GregorianCalendar.DAY_OF_MONTH));
    
    long lMillis = 999999999999L;
    calender.setTimeInMillis(lMillis);
    
    System.out.printf("\n%d/%d/%d", calender.get(GregorianCalendar.YEAR), calender.get(GregorianCalendar.MONTH) + 1, calender.get(GregorianCalendar.DAY_OF_MONTH));
  }
}
