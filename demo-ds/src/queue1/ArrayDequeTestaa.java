package queue1;

import java.util.ArrayDeque;

public class ArrayDequeTestaa {
  
  public static void main(String[] args){
    
    ArrayDeque<String> a1 = new ArrayDeque<>();
    a1.add("abc");
    a1.add("def");
  System.out.println(a1.poll()); // abc
  System.out.println(a1.size()); // 1
    a1.addFirst("first");
    a1.addLast("last");
    System.out.println(a1.poll()); // first

}
}
