public class Rectangle {

  public static double area(double length, double width){
      return length * width;
  }
  public static double perimeter(double length, double width){
      return 2*(length + width);
  }
  public static void main(String[] args){
    //area
    double area1 = area(5.0d,3.0d);
    double area2 = area(13.0d,5.0d);
    System.out.println(area1);
    System.out.println(area2);
    // perimeter
    double perimeter1 = perimeter(10.0d,90.d);
    double perimeter2 = perimeter(55.0d,44.0d);
System.out.println(perimeter1);
System.out.println(perimeter2);
  }



}
