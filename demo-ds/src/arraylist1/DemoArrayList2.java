package arraylist1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList2 {
  public static void main(String[] args) {
    // ArrayList String
    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");

    System.out.println(strs.subList(1, 2)); // def, from idx 1 to idx 1
    // Remove the first occurence of "def"
    strs.remove("def"); // remove by Object, //First in First out? remove都第一個!
    System.out.println(strs); // [abc, xyz, def]
    strs.remove(1); // remove by index
    System.out.println(strs); // [abc, def]

    System.out.println("Iterator Start");
    Iterator<String> iterator = strs.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("For each start");
    for (String s : strs) { // for-each support Array and ArrayList
      System.out.println(s);
    }

    Object[] objects = strs.toArray(); // ArrayList<String> -> Object[]
    for (Object o : objects) {
      if (o instanceof String) {
        String str = (String) o;
        System.out.println(str);
      }
    }

    // Array -> ArrayList
    String[] strings = new String[] {"hello", "world", "!"};

    List<String> s2 = new ArrayList<>(); // List is Interface
    s2.add("abc"); // add() method must be reflecting the add() in ArrayList

    // Read Only -> big bug
    System.out.println("READ ONLY");
    List<String> stringList = Arrays.asList(strings); // for demo real 用
    System.out.println(stringList); // [hello, world, !]
    // stringList.add("ijk"); // run-time error, add唔到野

    // Read & Write (Solution)
    List<String> stringList2 = new ArrayList<>(Arrays.asList(strings)); // 右邊strings是array，你也可以放 "ABC","DEFCB"
    stringList2.add("ijk");
    System.out.println(stringList2); //[hello, world, !, ijk]

    // Array -> ArrayList
    // Arrays.asList
    int[] arr2 =new int[]{2,3,4};
   
  
    Integer [] arr = new Integer[]{11,2};
    List<Integer> list99 = new ArrayList<>(Arrays.asList(arr));// cannot arr2, array無autoboxing
    System.out.println(list99); //[11, 2]
  }
}
