package NOTES;

public abstract class Animalabstract {
  public String name;

  public Animalabstract(){

  }
  public Animalabstract(String name){
    this.name=name;
  }
  //abstract method ( must be implemented by subclasses)
  public abstract void makesound(); // abtract method無{} 用;

  //default method (Is overriden optionally by subclasses)
  public void sleep(){
    System.out.println("animal is sleeping");
  }
  //final method ( cannot be overriden by subclass)
  public final void doNothing(){
    System.out.println("animal do nothing final method");
  }
  public static void someStaticMethod(){
    System.out.println("animal some static method");
  }

}
