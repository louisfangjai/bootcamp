import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public class Superman implements Flyable {
  
  @Override
  public void fly(){
    System.out.println("I am flying");
  }

  public static void main(String[] args) {
     // 3 ways to new a flyable object
   //1.
    Flyable superman = new Superman();
    // 2. Anonymous <<少人寫
    Flyable superman2 = new Flyable(){
      @Override
      public void fly(){
        System.out.println("I am Anonymous");
      }
    };
    //3, Lambda
    Flyable superman3 = () -> System.out.println("I am Lambda");


    Optional<String> string = Optional.ofNullable("abc");
    //int sum =0;
    string.ifPresent(e->{ // 入面是void , ifPresent可以touch到出面GE野
        //sum++;
     // String s ="";
    });
    // s= s+"hello";

    int total = 0;
    if(string.isPresent()){
      total++; //可以操作出面
     // String s ="";
    }
    //s = s+ "";

    int t=0;
    Arrays.asList(1,2,3,4).stream()//
      .count(); //4
      System.out.println(Arrays.asList(1,2,3,4).stream().count());
  }

  public static double add(double a, double b){ // 封裝運算
      return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doubleValue();
  }
} // double compare 無事
