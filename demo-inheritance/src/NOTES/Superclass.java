package NOTES;

public class Superclass {
  
  private int someValue;

  public Superclass(){
    System.out.println("superclass empty");
  }
  public Superclass(int someValue){
    this.someValue=someValue;
    System.out.println("Superclass allargs");
  }
  public CharSequence getString(){
    return "return";
  }

  public void G2(){
    System.out.println("G2");
  }
}
