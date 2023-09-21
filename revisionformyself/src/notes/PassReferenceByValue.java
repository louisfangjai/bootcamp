package notes;

public class PassReferenceByValue {
  
  public static void doSomething(String name){
    name="LAB";

  }

  public static void main(String[] args) {
    String name = new String("Venturenix");
    doSomething(name);
    System.out.println(name); //Venturenix

  }
}
