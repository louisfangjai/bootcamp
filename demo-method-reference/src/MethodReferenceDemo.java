import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {
  
  public static void main(String[] args) throws Exception {
    
    Consumer<String> sysout = s-> System.out.println("ANGUS"+s);
    Consumer<String> sysout2 = System.out::println;// static method< println become

    Arrays.asList("abc","def").forEach(sysout2);
    
    String name = "john";
    Supplier<Integer> strlength = ()-> name.length(); //lambda
    Supplier<Integer> strlength2 = name ::length; // use object to . method都ok
    System.out.println("TEST");
    System.out.println(strlength); // 2個: 代表lambda

    List<String> words = Arrays.asList("apple","bana","orange");
    Comparator<String> compare = (s1,s2)-> s2.compareTo(s1);
    Comparator<String> compare2 = String::compareTo; //唔友好，佢係instance method

    Function<String,Integer> StringToInteger = 
    str -> Integer.valueOf(str+"2");
    //constructor 
    Function<String,Integer> StringToInteger2 = Integer::valueOf;
    Function<String,Integer> StringToInteger3 = Integer::new;
  }
}
