package shape;

import java.math.BigDecimal;

public class Circle2 {
  private double radius;
  private static final double pi = 3.14159;

  private Circle2(double radius){ // private左個constructor
    this.radius=radius;
  }

  public static Circle2 of(double radius){ //method入面new左個object
    return new Circle2(radius);//  method's name=of，黃色Circle2是class，這個Method是行緊constructor
  }  

  public double area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(pi))
    .doubleValue();
  }

  public static void main(String[] args){
    //Circle2 test = new Circle2(0.1d); // line 14
    //test.radius


    System.out.println(0.1*0.1*pi); // 0.031415900000000004
    System.out.println(Circle2.of(0.1d).area()); //0.0314159 ，佢背後有個機制to左string
  }
}
