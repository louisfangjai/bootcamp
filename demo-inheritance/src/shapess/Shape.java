package shapess;

import java.math.BigDecimal;

public abstract class Shape { // implicitily extends object

  public abstract double area(); // area() shape好虛連default都唔知點定，留比extends佢的人
  // 無parameters 

 
  // Factory Pattern
  public static double area(Shape[]shapes){
    BigDecimal total =BigDecimal.valueOf(0);
    for(Shape s : shapes){//咩array就用咩放前
      total = total.add(BigDecimal.valueOf(s.area()));
    }
    return total.doubleValue();
  }
  
  //01/08/2023 40mins
  public static void main(String[] args) {
    
    //Bigdecimal examples
    double total = 0.0d;
    BigDecimal b = BigDecimal.valueOf(total);
    b= b.add(BigDecimal.valueOf(5)); // 似String，pass by? 
    System.out.println(b.doubleValue()); //5.0
    
       // shapes area() example
  Circle10 circle = new Circle10(10.0d);
  Square10 square = new Square10(3.0d);
  Shape[] shapes = new Shape[]{circle,square};//
  System.out.println(Shape.area(shapes));//10*10*PI+3*3 

  }
}
