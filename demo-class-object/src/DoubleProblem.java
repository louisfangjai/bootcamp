import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem{

  public static void main (String[] args){
    double result = 0.1+0.2;
    System.out.println(result); // 0.30000000000000004

    if (result == 0.3)
    System.out.println("result = 0.3");
    else
    System.out.println("result !=0.3");

    System.out.println(0.3/0.1); // 2.9999999999999996
    System.out.println(0.2*0.1); // 0.020000000000000004 byte問題

    //Solution:
    BigDecimal b = new BigDecimal(5.5);
    BigDecimal b2 = BigDecimal.valueOf(4);
   // BigDecimal b3 = 5.0; // NOT OK
   Double d = 5.0d;
    
   //b = b*b; 佢唔係double唔可以+-*/
   System.out.println(b.multiply(b));//  5*5 ~25
   System.out.println(b.subtract(b2)); // 5-4 ->1
   System.out.println(b.add(b));  // 5+5=10
   System.out.println("Divide = "+b.divide(b)); //5/5=1
   //System.out.println(b.add(5)); 咁寫唔得
   System.out.println(b.add(new BigDecimal(7))); //5+7=12

   System.out.println(b.compareTo(b2)); // b=5,b2=4, b>b2(True) result=1
   System.out.println(b2.compareTo(b)); // b=5,b2=4, b2<b(false) result =-1
   System.out.println(b.compareTo(BigDecimal.valueOf(5))); //0,same

   BigDecimal b3 = BigDecimal.valueOf(3.456);
   System.out.println(b3.setScale(2,RoundingMode.UP));// //3.46
    System.out.println(b3.setScale(2,RoundingMode.DOWN));//  3.45

    System.out.println(b.equals(b2)); // 5 !=4 ->false

    BigDecimal b4 = BigDecimal.valueOf(5);
    System.out.println(b.equals(b4)); // true ,5==5
    System.out.println(b ==b4); //false，唔同object唔同addess


    System.out.println(b4.remainder(BigDecimal.valueOf(3))); // 5%3
  }
}