package Crash;

public class X extends Y {
  
  private String name; // hiding,撞名但都可以做到

  public X(){

  }
  public X(String name){
    super("John"); //細波儲存左個John     super=call parent constructor
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public String getParentName(){
    return super.getName();
  }

  public static void staticMethod(){
    System.out.println("I am X");
  }
  public static void main(String[] args) {
    X x = new X("Peter");
System.out.println(x.getName());// Peter
System.out.println(x.getParentName());// John
// System.out.println(((Y)x).getName());
    
// Hiding
Y y = new X("Tommy");
y.staticMethod(); // 會CALL左Y果個，I am Y ,Hiding //但STATIC METHOD唔應該咁CALL
x.staticMethod();//X
((Y)x).staticMethod();// Y, X extends Y
((X)y).staticMethod(); //X
// You should practice and understand below syntax
Y.staticMethod();// I am Y
X.staticMethod();// I am X
System.out.println(y.getName());// Tommy
  }
}
