package NOTES;

public class Subclass extends Superclass{
  private int otherValue;

  public Subclass(){
    System.out.println("subclass empty");// Does not specify superclass's no args constructor here
    // But Superclass() constructors will still be invoked implicitly
  }

  public Subclass(int someValue,int otherValue){
    super(someValue); // call superclass all//若無super便會ca;; 左super empty 果個
    this.otherValue=otherValue;
    System.out.println("Subclass all");
  }
  public void G1(){
    System.out.println("G1");;
  }
  @Override
  public String getString(){
    return "overide, getstring";
  }
 public static void main(String[] args) {
  Subclass s1 =new Subclass(); // inherits both parent class emptys and subclass empty
  Subclass s2 =new Subclass(2,3);
  System.out.println(s2.getString());
  s2.G1();
  s2.G2();
  
 }

}
