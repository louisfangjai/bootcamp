package abstracts1;
public abstract class Person{ // abstract 同 final either one, class一係唔可以被人extend(final) 唔可以被人new (abstract)
  //無person 就唔可以new Person，你想唔想被人new個person 如果唔想就abstract.
  //abstract唔可以new個class
  private int age; //0

  private double height; // 0.0 
  //age height..common factor

  public Person(){

  }//唔想被人new都有constructor，人地new果陣，person變左最細個波

  public int getAge(){
    return this.age;
  }
  public double getHeight(){
    return this.height;
  }

  // May contain instance method with implementation (non-static)
  public void run(){
    System.out.println("I am person,running");
  }
// May contain abstract method (without implementation)
  public abstract void sleep();//想終結個extends就要sleep，你要implement sleep先可以extends
}
