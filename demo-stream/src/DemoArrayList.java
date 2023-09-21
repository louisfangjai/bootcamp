import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {

   public static void main(String[] args) {
      List<String> strings = new ArrayList<>();
      strings.add("abc");
      strings.add("ghi");
      strings.add("def");

      // for-each
      for (String sa : strings) {
         System.out.println(sa);
      }

      System.out.println("Stream Start");
      // Stream
      Stream<String> streamStrings = strings.stream(); // 不再是List
      // Stream.filter ，Filtering，filter淨startsWith"a"，filter return new stream
      streamStrings = streamStrings.filter(s -> s.startsWith("a"));// filter()放preedicate , startsWith return boolean
      // System.out.println(streamStrings.filter(s -> s.startsWith("a")));
      // Stream.forEach
      streamStrings.forEach(s -> System.out.println(s));// abc

      strings.stream()//
            .filter(s -> s.endsWith("i"))//
            .forEach(s -> System.out.println(s)); // ghi
      strings.forEach(s->System.out.println(s));
      // .forEach , List, stream both can use?

      List<String> strings2 = strings.stream() // .stream() return stream,
            .filter(s -> s.length() == 3) // 無野fill走
            .collect(Collectors.toList());
      System.out.println("strings2 is " + strings2);

      System.out.println(strings2.size()); // 3

      // Stream.map()
      List<Integer> lengths = strings2.stream()//
            .filter(e -> e.startsWith("a") || e.startsWith("d"))
            .map(e -> e.length())// Stream<Integer>( fill完>map) (轉data structure)
            .collect(Collectors.toList()); // collect返出黎
      System.out.println("List<Integer> START");
      lengths.forEach(e -> System.out.println(e)); // 3 3

      // Stream.sorted() lambda
      strings2.stream()// 不是用緊strings2改野 > new左個stream()
            .sorted((s1, s2) -> s2.compareTo(s1)) // descending order (sort完>stream)
            // .collect(Collectors.toList()) // stream都可以forEaach
            .forEach(s -> System.out.println(s)); // ghi,def,abc
            

      if (strings2.stream().anyMatch(e -> e.startsWith("a"))) {
         System.out.println("One of the elements starts with a");
      }

      // interminate opperations: 中斷
      // filter(),map(),sorted(),anyMatch()

      // terminated operations: 終止
      // collect(), forEach(), count() 個stream會terminated

      // Stream can only terminate once,
      // but it may have multiple interminate operations

      List<Person> persons =
            Arrays.asList(new Person("John", 30), new Person("Mary", 25));
      // stream-> get all the names from persons
      List<String> names = persons.stream()//
            .map(e -> {
               String word = " words ...";
               return e.getName() + word;
            }) // Stream<String>
            .collect(Collectors.toList());
      System.out.println(names); // [John words ..., Mary words ...]

      System.out.println(names.stream().filter(e -> e.startsWith("John")).count());// 1

      // Stream static method
      Predicate<String> lengthFunc = e -> e.length() == 3;
      

      long l = Stream.of("abc", "defz", "ghib", "abc") // 入面放咩都得
            .filter(e -> e.length() == 3) // Predicate
            .distinct() // 消滅 duplicate// remove duplicates
            .count();// 1 // return long
      System.out.println(l);// 1

      long l2 = Stream.of(1, 2, 3, 4)//
            .map(e -> {
               System.out.println(e); // why?
               return e;
            }).count(); // terminate operation
      // 睇左terminate operation先睇map
      // map唔會改變個數量，但即個element改變左 Structure，但都係set,list
      System.out.println("l2 is "+l2);// 4

      // 你map係為左collect返出黎變成另一個data value
      // List<> 去integer
      List<Integer> integers = Stream.of(1, 2, 3, 4)//
            // .filter(e->e==2)//
            .map(e -> {
               System.out.println("map = " + e);
               return 2;
            })//
              // .forEaach(e-> System.out.println(e));//2
            .collect(Collectors.toList());

      System.out.println(integers); // [2, 2, 2, 2]

      int setSize = Stream.of(1, 2, 3, 3) //
            .collect(Collectors.toSet()).size(); //
      System.out.println(setSize);// 3

      System.out.println("Stream start");
      Stream.of(1, 2, 3, 3, 5)//
            .filter(e -> e < 6 && e > 2).forEach(e -> System.out.println(e));// 3 5 5

      List<String> animals = Arrays.asList("lion", "tiger", "bear");
      // List<String> animals2 = new ArrayList<>();
      // animals.add("Matthew");
      // System.out.println(animals.size());

      Map<String, Integer> animalMap = animals.stream()//
            .collect(Collectors.toMap(str -> str, str -> str.length()));

      // Wrapper class用equal>使命class value係米相等
      // String,所有class都係用equal, primitive 同enum 用 ==
      // primitive 不是object

      // Loop Map , 將個功能交比佢
      for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
         System.out.println(entry.getKey() + " " + entry.getValue());
      }
      
      //Stream.iterate(), just for information
      Stream.iterate(1, n -> n + 2
            //System.out.println("after print on foreach") ;
      )
      .limit(3)
      .forEach(e-> System.out.println(e));


   }

   public static boolean findElderly(List<Person> persons) { // 無野要this>static method
      return persons.stream()// //Stream<>
            .filter(e -> e.isElderly())// Stream<>
            .findFirst() // Optional<Person>
            .isPresent();// boolean //存唔存在 // filter>find First>isPreesent
   }
}


