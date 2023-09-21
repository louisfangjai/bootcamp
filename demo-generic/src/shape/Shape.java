package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.print.attribute.IntegerSyntax;

public  abstract class Shape { // 用<T>是唔對路，無意思放Integer...String... attribute要放 T
                              // interface 怪怪
abstract double area(); // implicitly public

  public static <T extends Shape> double area(List<T> shapes) { // Approach1
    // public static double area(List< ? extends Shape> shapes){ // Approach2，extends Shape因為要用佢個method
    // 但盡量唔寫問號，所以Approach 1較好

    BigDecimal total = BigDecimal.ZERO;
   //shapes.add(new Circle()); // compile - time check，type-safe //佢操作緊個List 唔OK

    for (Shape shape : shapes) {
    total = total.add(BigDecimal.valueOf(shape.area())); // 因為area不是操作緊個List(shapes)，操作緊個別(1個shape)
      // 借polymorphism去計area
    }
    return total.doubleValue();

  }

  public static void main(String[] args) {

    List<? extends Integer> list99 = new ArrayList<Integer>();
    // list = new ArrayList<Number>();
    list99 = new ArrayList<Integer>();
    // extends>下

    List<? super Integer> list22 = new ArrayList<Integer>();
    list22 = new ArrayList<Number>();
    list22 = new ArrayList<Object>();
    // super上

    Shape shape = new Circle(); // Polymorphism
    Shape shape2 = new Square(); // Polymorphism
    List<Shape> shapes = new ArrayList<>();//要add的做法
    shapes.add(new Circle()); 
    //shapes = new ArrayList<Circle>(); // compile-error
 //shapes = new ArrayList<Circle>(); // 這不是polymorphism關係，罩住就唔同，List同 ArrayList先係polymorphism // compile-error

    ArrayList<Shape> shapes2 = new ArrayList<Shape>(); // 右邊唔寫就默認係左手面，寫左都得
    List<? extends Shape> list = new ArrayList<Circle>(); 
    list = new ArrayList<Square>(); // OK
    list = new ArrayList<Shape>(); // OK 
    list = new ArrayList<Circle>();
     // list.add(new Shape());
    // list.add(new Circle()); // compile check refer to declaration(左手)太含糊
    // list.add(new Square()); // 無define到個Strong type，所以唔可以add野住，< ? extends Shape>太處
    // how about if list.add(new Shape())? if Shape is not an abstract class


    for (Shape s : list) {
      s.area();
    }
    List<Map<String, String>> list2 = new ArrayList<>();//個List裝住好多個Map
    list2.add(new HashMap<>());
  }
}
