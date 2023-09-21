package hashmap1;

import java.util.HashMap;
import java.util.Map;
  
public class DemoHashMapa { //HashMap唔洗Index搵野唔洗for loop 好高速度, otimalized d for loop
  //唔應該用value搵key

  public static void main(String[] args) {
    // Background:String[int], Array must use int as index
    // Limitation: you can only access the element by int index
    // Solution: HashMap()
    HashMap<String, String> mapa = new HashMap<>();
    // <String, String> ---> <key,value>
    mapa.put("abc", "hello"); // entry
    mapa.put("bcd", "I am Developer");// entry
    
    System.out.println(mapa.size()); // 2 entries
    // Map.Entry -> Key + value

    // if duplicated (equals(), hashCode(), overide// hashset是唔做野
    mapa.put("abc", "hello world");// Override the entry with key "abc"
    System.out.println("TEST START");
    System.out.println(mapa.get("abc")); // hello world
    System.out.println(mapa.size()); // 2 entries

    System.out.println(mapa.isEmpty()); // false
    System.out.println(mapa.toString());// {bcd=I am Developer, abc=hello world}
    System.out.println(mapa); // {bcd=I am Developer, abc=hello world} ,本身有tostring

    System.out.println(mapa.containsKey("abc"));// true
    System.out.println(mapa.containsValue("I am Developer"));// true

    if (!mapa.containsKey("abc"))
      return;// return個program

    System.out.println("mapa is "+mapa);
    // loop Entries
    for (Map.Entry<String, String> entry : mapa.entrySet()) { // return: set of entry
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    // loop Keys
    for (String key : mapa.keySet()) { // return: set of entry
      System.out.println("for each (key)  "+key);
    }

    // loop Values
    for (String value : mapa.values()) { // return: set of entry
      System.out.println("for each (value)  "+ value);
    }

    System.out.println(mapa.remove("abc")); // hello world
    System.out.println(mapa.remove("ccc")); // return : null, 無呢個key
    System.out.println(mapa.remove("bcd", "I am NOT Develioer")); // false
    System.out.println(mapa.remove("bcd", "I am Developer")); // true
    

  }
}
