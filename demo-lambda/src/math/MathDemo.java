package math;

public class MathDemo {
  
  public static int calculate(int i, int j,MathOperation formula){
    return formula.operate(i, j);
  }

  public static void main(String[] args) {
    MathOperation add = (a,b) -> a+b;  //不一定要跟返 x,y
    MathOperation substract = (x,y) -> x-y;
    MathOperation multiply = (x,y) -> x*y;
    MathOperation divide = (x,y) -> x/y;
    MathOperation remainder = (x,y) -> x%y;

    System.out.println(calculate(1, 3, add)); //4
    System.out.println(calculate(10,2, divide)); //5
    System.out.println(calculate(4, 7, multiply));//28
    System.out.println(calculate(4,7, (x,y)-> x*y)); //28 另一個寫法

  }
}
