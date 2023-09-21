import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseForStream {
  
  public static void main(String[] args) {
    
    List<String> strings = new ArrayList<>();
    strings.add("HIM");
    strings.add("HER");
    System.out.println(strings.size()); //2
    strings.add("Angus");
    strings.add("Andy");
    
    for(String variable:strings){ // 自己set>//strings 係個list
      //System.out.println(variable);
    }
    Stream<String> streamStrings = strings.stream(); //list->stream

    //Approach1 利用forEach return void特性去print野 (直接係個list到.stream)
    strings.stream()
    .filter(s->s.startsWith("A"))
    .forEach(s->System.out.println(s)); // Angus, Andy

    System.out.println(strings); // [HIM, HIM, Angus, Andy] ，上面做的野無改變到條List
    
    //Approach 2 先用Stream去裝先 filter return the new stream然後再.forEach
    streamStrings=
    strings.stream()
    .filter(s->s.contains("A")); // 也可以endsWith...等等(String methods)

    Stream<String>streamStrings2= streamStrings; // 2個obj reference都係指住同一個object
    //streamStrings2.forEach(s->{System.out.println(s);}); // Angus, Andy
    System.out.println(streamStrings2); //  java.util.stream.ReferencePipeline$2@77459877

    // collect 可以collect個 stream做list
    List<String> strings2 = streamStrings.collect(Collectors.toList()); //
    System.out.println("Strings2 is "+ strings2); //A:runtime error 因為termainate左 (line35)or [Angus, Andy]

    List<String> strings3 = strings.stream()
        .collect(Collectors.toList());
    System.out.println("The strings3 (List) is "+ strings3);
    strings3 = strings3.stream()
      .filter(s->s.length()>3)
      .collect(Collectors.toList());
      //strings3.filter(e->e.length()>4);
      System.out.println(strings3);
      System.out.println(strings3.size()); //2

    //Stream.map() -> change data structure
    System.out.println(strings);
    System.out.println(strings2);
    System.out.println(strings3);
    List<Integer> lengths = strings.stream()
      .filter(s->s.startsWith("A")|| s.endsWith("s"))
      .map(e->e.length())
      .collect(Collectors.toList());
    
      System.out.println(lengths); // [5,4]
      lengths.forEach(e->System.out.println(e)); // 5,4
      //lengths.filter(e->e<3);
      

      //Stream.sorted() lambda

      List<String> stringss = new ArrayList<>();
      stringss.add("abc");
      stringss.add("bbc");
      stringss.add("cbc");
      stringss.add("dbc");
    List<String> stringss2=  stringss.stream()
        .sorted((s1,s2)->s2.compareTo(s1))
        //.forEach(s->System.out.println(s));
        .collect(Collectors.toList());
        System.out.println(stringss2);

      if(stringss.stream().anyMatch(e->e.startsWith("A")))
        System.out.println("YES");
        else 
          System.out.println("NO");
        
      }

    
    
  }

