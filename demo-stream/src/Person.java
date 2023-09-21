import java.util.List;

public class Person {
  
  private String name;
  private List<String> addresses;
  int age;

  
  public Person(String name, int age){
    this.name=name;
    this.age=age;
  }
  public Person(String name, List<String>addresses){
    this.name=name;
    this.addresses=addresses;

  }

  public Person(String name){
    this.name=name;
  }

  public String getName(){
    return this.name;
  }

  public List<String>getAddress(){
    return this.addresses;
  }

  public int getAge(){
    return this.age;
  }

  public boolean isElderly(){
    return this.age>=65;
  }
  @Override
  public String toString(){
    return "Person(Name"+this.name+", addresses="+this.addresses
    +")";
  }
}
