package map;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T> { // Java 17 removed feature: "extends String"
  // < T extends wrapper class尷尬>
  Map<T,String> map;

  public AnimalMap(){
    map = new HashMap<>();
  }

  public void put(T key,String animal){ //個key係任何野，person都得
    map.put(key, animal); // run time program入面GE野
    //寫個put method去罩住個put method
  }
  // compile time同generic要互相
  public static void main(String[] args) {
    AnimalMap<String>map1 = new AnimalMap<>(); // 
    map1.put("abc","dog");


    AnimalMap<Integer>map2 = new AnimalMap<>(); // 
    map2.put(1,"dog");
  }
}
