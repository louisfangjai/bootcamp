package notes;

public class PassByValue {
  
  public static void doSomething(int x){
      x=99;

      System.out.println("static doSomeing method x is "+x);
  }

  public static void main(String[] args) {
    int x=10;
    doSomething(x);
    System.out.println("x is "+x);// 10
  }
}
