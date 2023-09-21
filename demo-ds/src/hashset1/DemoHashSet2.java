package hashset1;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet2 {
  
  public static void main(String[] args) {
    // HashSet Byte
    HashSet<Byte> bytes = new HashSet<>(); // <>一定要class Byte，不可以bytes
   // bytes.add(4);// int --> Byte 轉唔到，byte-->Byte就得
   //bytes.add(Byte.valueOf((byte)4));// int-> byte->Byte
   bytes.add(bytes(4)); // int-> byte->Byte
   boolean isAdded10 =bytes.add(bytes(10)); // int-> byte->Byte
   System.out.println(isAdded10); //true
   // Java is not necessary to handle return value
   boolean isAdded4 = bytes.add(bytes(4));
   System.out.println("isAdded4  " +isAdded4);//false

   String s ="Hello";
   s.replace("h", "o"); // result string，要留意佢return type
   //ArrayList<String>string = new ArrayList<>();

   HashSet<Byte>byte2 = new HashSet<>();
   byte2.add(bytes(4));
   byte2.add(bytes(10));
   System.out.println(bytes.equals(byte2)); // true 佢唔係check緊地址

   boolean isRemoved10 = bytes.remove(bytes(10));
   System.out.println(isRemoved10);//true

   // Java唔可以殺Object，只可以靠佢回收
   bytes.clear();
   byte2.clear();
   System.out.println(bytes.size()); //0
   System.out.println(byte2.size()); //0
   byte2.iterator();
  }

  public static Byte bytes(int num){
    return (Byte.valueOf((byte)num));
}
}
