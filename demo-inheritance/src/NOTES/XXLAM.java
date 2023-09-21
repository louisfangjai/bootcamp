package NOTES;



public class XXLAM extends YYLAM{
  private String name; // hiding,撞名但都可以做到

  public XXLAM(){

  }
  public XXLAM(String name){
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
    System.out.println("I am XXLAM");
  }
  public static void main(String[] args) {
    YYLAM y2 = new YYLAM("YY");
    System.out.println(y2.getName());//YY
    XXLAM x = new XXLAM("Peter");
System.out.println(x.getName());// Peter
System.out.println(x.getParentName());// John
// System.out.println(((Y)x).getName());
    
//Hiding
YYLAM y3 = new XXLAM("Tommy");
//y3.staticMethod(); // I am YY LAM ,Hiding //但STATIC METHOD唔應該咁CALL
// You should practice and understand below syntax
YYLAM.staticMethod();// I am Y
XXLAM.staticMethod();// I am X
System.out.println(y3.getName());// Tommy
   }
}
