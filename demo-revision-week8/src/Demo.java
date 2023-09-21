import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
  public static void main(String[] args) throws Exception{
    // Stream support List, Map,Arrays.stream()
    //Collection是最大grand parent
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("defijk");
    strings.stream()
      .filter(e->e.startsWith("a"))
      .forEach(e->System.out.println(e)); // abc

      strings.stream()
        .map(e->e.length())// convert string to int, element轉左
        .filter(l->l<5)
        .forEach(e->System.out.println(e)); // 3

        Integer i = 10;
        Integer j = 10;
        System.out.println(i.equals(j)); // true

       i = 1000;
       j =1000;
        System.out.println(i==j); // false <<所以唔好用 ==


        String s1 = "abc"; // new String("abc")
        String s2 ="abc"; // String Literal pool ,無辦法去new出黎
        System.out.println(s1==s2); // true

        String s3 = s2;
        System.out.println(s3==s1); // true
        
        s1 = s1 +"d"; // String is immutable, new String ("abcd") //在heap生旌new object 而不是改變原有object
        System.out.println("s1 is "+s1+" s2 is "+s2+" s3 is "+s3);

        //＊＊ WRAPPER CLASS e,g Integer set variable都用.valueeOf
        Integer a = 129;// object 1 (129)
        System.out.println(System.identityHashCode(a));
        a= a+1; // Cannot revise the value of the object. Integer is immutable.
        System.out.println(System.identityHashCode(a)); // reference changed
        Integer a3 = Integer.valueOf(127);
        Integer a4 = Integer.valueOf(127);
        Integer a5 = Integer.valueOf(127);
        Integer a6 = Integer.valueOf(127);
        Integer a7 =  new Integer(127);


        Integer b = new Integer(129);
        b = 130;
        Integer b2 =129;
        // 一個129 1個130

        
  }

  public static List<Integer> getAges(List<String>list){ // becareful null pointer
      return list.stream()
        .map(e->e.length()) // convert string to int
        .filter(e->e<5) //
        .collect(Collectors.toList());//



  } //這個 static method無開variable 


}
