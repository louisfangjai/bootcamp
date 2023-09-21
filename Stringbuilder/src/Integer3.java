public class Integer3 {

  //Internal Cache ( Store range : -128 to 127)
  public static void main(String[] args){
    Integer i1= 100;
    Integer i2 =100;
    System.out.println(i1 == i2); // true, value or address?-> address    
    i2=128;
    Integer i3 =128;
    Integer i4 =128;
    System.out.println("i2==i3?"+(i2==i3));//false
    if(i3 ==128){ // i3->int (Wrapper Class -> Primitive)
      System.out.println("i3 ==128");
    }
    System.out.println(i3==i4); //address,false

    Integer i5 =-128;
    Integer i6 =-128;
    System.out.println(i5==i6); //address,true

    Byte b1 =127; // byte最多得256個波,Byte任何value都係
    Byte b2 =127; //same127 in internal cache 
    //Byte b2 = new Byte(127); // -< destory internal Cache，唔可以再new
    //Short,Long

    Short s1 = 128;
    Short s2 = 128;
    System.out.println("short128"+(s1==s2));
    Long l1 = 88L;

    // No Internal Cache in Float and Double
    Float f1 = 1.3f;
    Float f2 = 1.3f;
    System.out.println(f1 == f2);// false , point to different Float objects with the same value 1.3f
    Double d1 =1.3d;
    Double d2 =1.3d;
    System.out.println(d1 == d2); //false 

    //boolean都有
    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1 == bool2);// check object, true, same address 指住同一個波>internal Cache
    boolean bool3 =false;
    System.out.println("boolean  "+ (bool1==bool3));// true
    boolean bool4 =false;
    System.out.println("boolean  "+ (bool4==bool3));// true
    Boolean bool5 = new Boolean(false);
    Boolean bool6 = new Boolean(false);
    System.out.println(bool5==bool6); //false

    // Internal Cache -> ASCII(0-127)
    Character c1 ='a';
    Character c2 = 'a';
    Character c3 = 'Ϩ'; //ASCII code =1000, out of cache range
    Character c4 = 'Ϩ'; //ASCII codee =1000, out off cache range
    System.out.println(c1 == c2); //true, check緊address 有internal Cache，所以same address
    System.out.println(c3==c4); // false, out of range

    //valueOf() has Internal Cache -128 to 127 
    Integer i7 = Integer.valueOf(127); //
    Integer i8 = 127;
    System.out.println("i7 " +(i7==i8));//true

    Integer i9 = Integer.valueOf(128); // New Object,valueOf功能
    Integer i10 = 128;
    System.out.println(i9==i10);//false

    Integer i11 = new Integer(128); //佢本身就會new?
    Double d9 = Double.valueOf(127d);
    Double d19 = Double.valueOf(127d);
    System.out.println(d9==d19); //false

    String str1 = String.valueOf(12); //int
    String str2 = String.valueOf(12);
    System.out.println("String.valueOf = " + (str1==str2));//false

    String str3 = String.valueOf("128"); //string
    String str4 = String.valueOf("128");
    System.out.println("34String.valueOf = " + (str3==str4));//true

    String str5 = String.valueOf(false);
    String str6 = String.valueOf(false);
    System.out.println(str6);
    System.out.println("56String.valueOf = " + (str5==str6));// true

    char[] chars = new char[] {'2','3'};
    System.out.println(chars[1]);
    String str7 =String.valueOf(chars);
    String str8 =String.valueOf(chars);
    System.out.println("78String.valueOf = "+(str7==str8)); //false
    }
}
