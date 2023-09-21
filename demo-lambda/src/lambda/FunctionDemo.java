package lambda;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import math.LengthFunction;

public class FunctionDemo {
  
  public static void main(String[] args) {
    // Function<String, Integer> 比String佢出Integer
    Function<String, Integer> lengthFunc = (str) -> str.length(); // str你define, formula，delcare function
    //一個variable可以唔洗() str or (str)
    Function<String, Character> firstCharFunc = str -> str.charAt(0); // 以前係儲住value，而家儲住function
    // Function 無得 new Function咁 // <input,result>
    
    //Function跟.apply
    System.out.println(lengthFunc.apply("abc")); //3

    LengthFunction lengthFunction = new LengthFunction(); //之前做法，唔用Lambda
    System.out.println(lengthFunction.apply("def")); //3

    System.out.println(firstCharFunc.apply("month"));//m

    // Function Example in Map
    Map<String,String> map = new HashMap<>();
    map.put("abc", "Mary");
    //Function<String,String> formula = s -> "default";
    String result = map.computeIfAbsent("def",s->"default"); // 要你入formula
    //目標 如果key唔存在就比D野佢
    System.out.println(map); //{abc=Mary, def=default}
    System.out.println(result);// "abc">Mary，"def">default
    System.out.println(map.size());//2 搵到key就比返你，搵唔到就幫你補位，佢幫你put埋入去

    //BiFunction
    BiFunction<Integer,Integer,BigDecimal>addition = 
        (x,y)-> BigDecimal.valueOf(x+y);
      System.out.println(addition.apply(-4, 3).abs()); //1 // apply完係出BigDecimal

      // map.compute("bcd",(s1,s2)->"value");
      // System.out.println(map.size());// 3 (無這key，put左入去)
      // map.compute("bcd", (s1,s2)->"another value");
      // System.out.println(map.size()); //3 (有這key replace)
      // System.out.println(map.get("bcd")); // another value

      // map.compute("bcd", (s1,s2)-> null); //可以用null去remove
      // System.out.println(map.size()); //2， 佢會remove

      Map<String,Integer> stock = new HashMap<>();
      stock.put("clothes",100); // 100 is price
      stock.compute("clothes",(item,oldPrice)-> (int)(oldPrice-oldPrice*0.1));
      System.out.println(stock.get("clothes"));//90

      // old value: oldPrice, new value: null, remove item
      stock.compute("clothes", (item,oldPrice)->null );
      System.out.println(stock.size());//0

      //
      stock.compute("shoes",(item,oldPrice)->120);
      System.out.println(stock.get("shoes")); //120
      System.out.println(stock.size());//1

  }
}
