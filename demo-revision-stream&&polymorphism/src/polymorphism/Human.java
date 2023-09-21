package polymorphism;
public class Human {
  private String name;

  public void order(){
    Customer.counter+=2;
  }

  public Human(String name){
    this.name=name;
  }

  public String getName(){
    return this.name;
  }
}
