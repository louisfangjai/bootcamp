package shape;

public class Circle {
  private int id; // instance variable/attribut
  private double radius; // if static -> radius是公家，即每個波都沒有屬於自己的radiuss
  // static -> shared variable 公家地方sharing
  // final -> one time initialization ONLY
  private static final double pi = 3.14159; // static variable/ class variable
  // static公家地方pantry係個波出面，if 無static便指緊每個object都有自己 ge pi
  // 左邊delcare 咩type ，右邊initializaion，慳資源 static final
  // final 是指被人assign左就唔可以改，不可以唔assign

  private static int counter;

  // calculate the number of circle objects being created
  //////////////////////////////////////////////////////////////////////////////////
  public Circle() { // empty constructor， new左就加加
                    // ???
    this.id = AddCounter(); // constructor 可以call method
  }

  public int getId() {
    return this.id;
  }

  public static int AddCounter() {
    return counter++;
  }

  public double area() {

    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference() { // instance method> object method
    return 2 * this.radius * pi; // this.pi是指每個circle都有自己 ge pi
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public static void main(String[] args) {
    Circle c = new Circle(); // Constructor
    // circle.radius =1; <唔private可以咁樣set
    // circle.radius =2; // 係呢個class先可以操作到
    c.setRadius(2);
    c.area();
    c.circumference();
    Circle c2 = new Circle();
    c2.setRadius(5);
    c2.area();
    c2.circumference();

  }
}
