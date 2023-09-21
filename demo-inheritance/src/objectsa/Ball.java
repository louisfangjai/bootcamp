package objectsa;

import java.util.Objects;

public class Ball {// implicitly extends object
 
  private String color; // 所有attribute一樣就一樣

  public Ball(String color) {
    this.color = color;
  }

  // 將個地址變成一堆code
  @Override
  public int hashCode() {
    // Hash Code is not unique representation of object reference(位置有限)
    return Objects.hash(this.color);
  }

  @Override
  public boolean equals(Object o) { // instance method
    // if address same, values inside the object must be same
    if (this == o) // address
      return true;
    if (!(o instanceof Ball))// instant>object ，O是否一個object of 波，唔係>false
      return false;
    // 上面 排除左 非波的家族
    Ball ball = (Ball) o; // downcast落個波到
    // return ball.color.equals(this.color);//true or false
    return Objects.equals(ball.color, this.color);// bug -> ball null
    
  }

  @Override
  public String toString(){
    return "[color = "+ this.color+"]";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball("Blue"); // address 1
    Ball b2 = new Ball("Blue"); // address 2
    System.out.println(b1 == b2);// false,一定係address
    System.out.println(b1.equals(b2)); // true, checking color, instead of memory address
    System.out.println(b1);// [color = Blue]
    System.out.println(b1.toString());//[color = Blue]
  }
}
