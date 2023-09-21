import java.util.ArrayList;
import java.util.List;

public class NotThatEasy {
  
  static final List<Character> characters= method();// static method 放入去static variable
  private static final char[] chars = {'J','a','c','k','y'};
  // final可以食一次

  final int x = method2(); // static method 放入去 instance variable

  static List<Character> method(){
    System.out.println("I am static method, called by static variable");
    return new ArrayList<>();
  }

  static int method2(){
    System.out.println("I am static method, called by instance variable");
    return 1;
  }
  static { // before個main已經行左
    System.out.println("I am static code block");
   // characters = new ArrayList<>();
  }

  // initialization code bloack
  {
    System.out.println("I am initialization code block"); // 無人new個 class 就唔會print
    // 有人new
  }


  public static void main(String[] args) {
    // Once you click the run button;
    // 1. Compile
    // 2. Run -> class loader (未開始run) -> stack memory
    System.out.println("Start of main");
    NotThatEasy obj = new NotThatEasy();
    NotThatEasy obj2 = new NotThatEasy();

  }
}
