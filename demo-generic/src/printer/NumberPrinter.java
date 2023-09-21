package printer;
public class NumberPrinter {
  
  int number;
  String string;

  public static void print(int num){
    System.out.println(num);
  }
  public static void print(String str){
    System.out.println(str);
  }

  public void print(){
    System.out.println(this.number);
  }

  // public void printString(){
  //   System.out.println(this.string);
  // }
  
}
