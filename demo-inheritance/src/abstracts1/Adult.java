package abstracts1;
public abstract class Adult extends Person {
  // abstract class extends abstraxct class
  // implicity "extends" abstract method
  
  public Adult(){
    super(); //new Person
  }


  public abstract void read();

  public void eat(){
    System.out.println("I am Adult,eating.");
  }
}
