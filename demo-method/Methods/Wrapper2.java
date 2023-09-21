public class Wrapper2 {

  public static void main(String[] args){
      //auto-boxing
      // 同wrapper class 的auto-boxing可以自由切換
      // String 不是wrapper class
      int i1 =10;
      Integer i2 =10; //auto-boxing
      Integer i3 = Integer.valueOf(10);

        int i4 = i2; // un-boxing (拆盒)
        System.out.println("i2 = "+i2);
        System.out.println("i3 = "+i3);

        char c ='a';
        Character c2 = c;
        char c3 = c2; 
        System.out.println("c2 = "+c2); 
        
        byte b = 1;
        Byte b2 = b;
        byte b3 = b2;

        long l4 = 100; // 100 or 100L ，因為int -> long (upcast)
        //Long l = 10;// int -> Long(大LONG)~error
        Long l = 10L; // long -> Long (auto-boxing)
        long l2 = l;
        Long l3 = l2;



  }
}