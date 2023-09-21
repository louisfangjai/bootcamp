package swimable.practice;

public class PersonRUN implements Runnable{
  
  String name;


  public PersonRUN(String name){ //con
  this.name=name;    
  }

  @Override
  public void run(){
    System.out.println("someone is running");
   }

  @Override
  public String toString(){
    return "[ name = "+this.name+" ]";
  }





}
