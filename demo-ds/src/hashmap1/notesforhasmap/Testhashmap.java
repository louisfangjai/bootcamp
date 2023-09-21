package hashmap1.notesforhasmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Testhashmap {
  
  public static void main(String[] args) {
    
  
  
  HashMap<Integer,String> studentMap = new HashMap<>();
  System.out.println(studentMap.put(4,"Patrick"));
  studentMap.put(5,"Alex");
  String str1 = studentMap.get(2);
  System.out.println(str1);// null ( it is because key2 is not found) 
  //2..get method return value,今次value係string
  System.out.println(studentMap.put(5, "abc"));
  System.out.println(studentMap.remove(5)); // Alex
  System.out.println(studentMap.size());//1
  System.out.println(studentMap.remove(1));// null
  System.out.println("put is "+studentMap.put(5,"Alex"));//null
  System.out.println(studentMap.remove(5,"Alex"));//true
  System.out.println(studentMap.remove(1,"Alex"));//false
  System.out.println(studentMap.size());//1


  System.out.println("remove > "+studentMap.remove(2));

  System.out.println(studentMap.get(4)); //patrick
  System.out.println(studentMap.keySet()); //[4,5]
  Set<Integer> keys = studentMap.keySet();
  System.out.println(keys); //[4,5]
  //
  System.out.println(studentMap.entrySet());//[4=Patrick, 5=Alex]
  Set<Map.Entry<Integer,String>> entries = studentMap.entrySet();
  System.out.println(entries);//[4=Patrick, 5=Alex]
  
  }
}
