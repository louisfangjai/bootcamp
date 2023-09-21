package lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
  
  public static void main(String[] args) {
    //Consumer只可以食一樣野 i.e <String>，consumer只可以係void
    Consumer<String> consumer = str-> {System.out.println(str);}; //println是出void
    consumer.accept("I love java"); // I love java

    BiConsumer<String,String>biConsumer=
    (s1,s2)-> System.out.println(s1+s2);
    biConsumer.accept("abc", "def");//abcdef

    //Example
    List<String>strings=new ArrayList<>();
    strings.add("dog");
    strings.add("cat");
    strings.add("cow");
    int f=8;
    strings.forEach(s->{ // forEach return void
      int i=0; //可以set condition,set咩都得的，void就可以
      int a=0;
      int total=i+a+f;//少控制f，通常within{}
      // callMethod(c)
      // if(i<1)
      // System.out.println(s); //不一定是print野，是void就可以了
    });
    // System.out.println(total);
    int total=0; //你可以delcare但唔可以用上面個a
    for(int i: Arrays.asList(2,3,4)){
      total+=i;
    }
    System.out.println(total);

    Map<String,Integer> map = new HashMap<>();  
    map.put("orange", 3);
    map.put("lemon", 2);
    map.put("watermelon", 10);
    map.forEach((key,value)->{
      if("lemon".equals(key))
        System.out.println(value);//2
    });

  }
}
