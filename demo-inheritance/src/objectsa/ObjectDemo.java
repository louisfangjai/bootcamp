package objectsa;

import shapess.Circle10;
import shapess.Shape;

public class ObjectDemo { // ObjectDemo extends Object
  // Rule 1: All class extends Object implicitly

  String name="hello";

//    @Override
//  public String toString(){
//   return this.name;
//  }

  public static void main(String[] args) {
  // Example 1: ObjectDemo extends Object
  ObjectDemo objectDemo = new ObjectDemo();
    // has code -> int
    objectDemo.hashCode(); // another presentation of object reference
    // Because hash code has a shortter range of value storage( 有機會重覆)
    //so, it cannot store all memory address(object reference) in your machine
    // object reference is unique, but hash code is not unique

    int[] arr = new int[]{1,2,3};
    System.out.println(arr);//[I@28a418fc , @is to string，有無to string都會to string
    //就算唔.toString()，佢都會to String
    System.out.println(arr.toString());
    
    Integer i =1;
    System.out.println("i = "+i);// =i.toString()


    String str ="abc";
    System.out.println(str); //abc, override左

    System.out.println(objectDemo);// 佢背後一定call緊to string/// objectsa.ObjectDemo@2f92e0f4>> hello
    System.out.println(objectDemo.toString());// objectsa.ObjectDemo@2f92e0f4 >> hello ( Overide左to String)
    // java 是不能access address，寫唔寫toString其實都call緊to String

    System.out.println("abc hashcode()= "+str.hashCode()); // 96354    ASCII 97 98 99
    // a*31^2 + b*31^1 +c
    System.out.println(97*(int)Math.pow(31, 2)+98*31+99);//string寫法: 96354, JAVA常用31，hashCode會重覆96354

    Integer i1 =3;
    System.out.println(i1.hashCode()); //3 佢的hashCode就係3
    Long l1 = 100L;
    System.out.println(l1.hashCode()); // overflow 100 Integer同Long都係用int去表達，所以會重覆

    ObjectDemo a = new ObjectDemo();
    ObjectDemo b = new ObjectDemo();
    System.out.println(a); //objectsa.ObjectDemo@681a9515 ( toString()->hashcode)
    System.out.println(b); //objectsa.ObjectDemo@3af49f1c  <這不是address ( toString()->hashcode)
    System.out.println("a==b? "+ (a==b)); //address (object reference) false
    
    //equals()
    String s1 ="abc";
    String s2 ="abc";
    System.out.println(s1.equals(s2)); // true
    // attributes same 就係equal

    //instanceOf, Object.class
    Object obj = new String("abc"); // obj is an object reference(address)
    System.out.println(obj instanceof String);//true, obj是實體
    obj= Long.valueOf(10);
    System.out.println("obj"+obj);
    System.out.println(obj instanceof String);//false
    System.out.println(obj instanceof Long);//true

     Shape shape = new Circle10(5.0d);
     //shape.print(); // no print() method in shape.
     //Hide child print() method
     System.out.println(shape.area()); //78.53981633974483, 5 * 5 * PI
     Circle10 c =(Circle10)shape; // cast返佢出黎先可以用個method
     c.print();// I am circle10

    //Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number);//true, //Number is a abstract class
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number);//true

    // Primitives, for comparsion, we use == (因為都用唔到其他)
    
    //Wrapper class equals,for comparsion, we use equals
    Integer J1 =128;
    Integer J2 =128;
    System.out.println(J1.equals(J2)); // true
    J1 =127;
    J2 =127;
    System.out.println(J1.equals(J2));//true, 用==係address，memory
    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2));//true

    System.out.println(bool1==(false)); // Boolean -> boolean
     System.out.println(bool1.equals(false));//比較好的寫法

    }
  }

