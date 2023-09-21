public class Student extends Person 
  implements Runnable,Swimable,Move { //執行合約 //class signature
                                // extends只可以一個，但合約可以有好多個
  private String name;
  private int score;
  @Override
  public void breath(){
    System.out.println("Student is breath");
  }

  @Override //合約是Public所以override都要public ,份合約有run同eat責任
  public void run(){
    System.out.println("Student is running");
  }
  @Override //
  public void swim(){
    System.out.println("Student is swimming");
  }
  @Override
  public void jump(){
   
  }
  @Override
  public void bigJump(){

  }
  public static void main(String[] args) {
    //Max_SPPEED

    System.out.println(Move.MAX_SPEED);//10
  //System.out.println(move.MAX_SPEED); //Not recommended

    Move student= new Student(); //student要implement move 同埋唔係abstract
        student.jump();

    Move dog = new Dog();
    dog.jump();

    Swimable swimable = new Student();
    swimable.swim();

    Person person = new Student(); //student extends person
    person.breath();
    person.getAge();
  }
}
