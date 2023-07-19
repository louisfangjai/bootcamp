public class Circle2 {
  
  public static int area (int radius){
    return radius*radius*3.14159;
  }
  public static int perimeter(int radius){
    return 2*radius*3.14159;
  }
  public static void main(String[] args){

      int area = area(4);
      int perimeter = perimeter(4);
      System.out.println(area);
      System.out.println(perimeter);
  }
}
