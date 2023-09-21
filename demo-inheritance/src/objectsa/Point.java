package objectsa;

import java.util.Objects;

public class Point {
   int x;
   int y;

  public Point(int x, int y){
    this.x =x;
    this.y =y;

  }
  // @Override
  // public String toString(){
  //   return "[ x = "+ this.x+", y = "+this.y+"]";
  // }
  @Override
  public int hashCode(){//背，你幾多attributes就一直comma
    return Objects.hash(this.x,this.y);
  }

  // @Override
  // public boolean equals(Object o){
  //   if(this == o)
  //   return true;
  //   if(!(o instanceof Point))
  //   return false;
  //   Point point = (Point) o;
  //   // return point.x == this.x && point.y == this.y;
  //   return Objects.equals(point.x,this.x)
  //   && Objects.equals(point.y,this.y);
  // }

  public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Point p3 = new Point(1, 2);
    System.out.println(p1==p2); //false
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.equals(p3)); // false
    System.out.println("p3 only "+p3); // objectsa.Point@3e2
    System.out.println(p3.toString());  // address,objectsa.Point@3e2
    System.out.println(Points.toString(p3)); //[ x = 1, y = 2]

    Long l =1L; // 1, unbox-> primitive long
    int i=1; // 1, auto-box -> Integer
    Point.print(10L); // long-> autobox -> Long// l=10
    Point.print(Long.valueOf("10")); // Long object // l=10
    //point.print(10); // cannot convert int to long, compile error ，佢唔可以一次過做兩步
     Point.print((long)10); // int-> long -> autobox->Long // l=10

     if(Long.valueOf("100")<101) { 
      // convert Long 100->long 100
      // 101->int// JVM按低佢
      // long vs int
     }

     if(Boolean.valueOf(false)==false){
      //right : false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
     }

     if(Boolean.valueOf(false).equals(false)){ // Boolean自己有個equals方法
      //right : false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
     }

    //unbox Long, and upcast int
    System.out.println(l==i);// true, finally long == int
    
    //Big bug here
    System.out.println(Objects.equals(l, i)); //false <大bug
    // int i -> Integer i (因為要入Object) 要追返LONG的.equals
    System.out.println(Objects.equals(Long.valueOf(1L),Integer.valueOf(i)));//false

  }
  public static void print(Long l){
    System.out.println("l= "+l);
  }
}
