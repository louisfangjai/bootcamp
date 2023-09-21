package shapess;


public class Circle10 extends Shape {// 只可以extends 一個class
  
  private double radius;

  public Circle10(double radius){
    this.radius=radius;
  }

  public double getRadius(){
    return this.radius;
  }
  @Override
  public double area(){
    return Math.pow(this.radius,2) * Math.PI;
  }

  public void print(){
    System.out.println("I am Circle10");
  }
}
