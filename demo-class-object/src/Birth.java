import java.time.LocalDate;
import java.time.Month;

public class Birth {
  
  public static void main(String[] args){
    LocalDate today = LocalDate.now();
    System.out.println(today);// 2023-07-28
    LocalDate specifiedDate =LocalDate.of(2023,Month.FEBRUARY, 28);
    System.out.println(specifiedDate);

    LocalDate d1 = LocalDate.parse("2023-12-30"); //出LocalDate呢個cost
    System.out.println(d1.getYear());// 2023
    System.out.println(d1.getMonth()); // DECEMBER
    Month result = d1.getMonth();
    System.out.println(result.getValue()); //12
    System.out.println(d1.getDayOfMonth()); //30
    System.out.println(d1.getDayOfWeek());//SATURDAY (DayOfWeek) 日期出星期幾

    System.out.println(LocalDate.parse("2023-07-28").getDayOfWeek());//FRIDAY , parse是static method, getDayOfWeek instant method
    System.out.println(LocalDate.parse("2023-07-28").getDayOfMonth());//28
    System.out.println(LocalDate.parse("2023-07-28").getDayOfYear());//209
    
    System.out.println(d1.plusMonths(1L)); // 2024-01-30
    //plusDays
    //plusYears

    boolean expiry = false;
    LocalDate effectivDate = LocalDate.of(2023,7,28);
    System.out.println("The effectiveDate is = "+effectivDate);
    if(LocalDate.now().isAfter(effectivDate.plusMonths(3L))){
        expiry = true;
    }
    System.out.println(expiry);
      
  }
}
