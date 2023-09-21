package abstracts1;
public class Student extends Adult { //要終結abstract method
 
  public Student(){
    super(); // new Adult()
  }
   // Must implement abstract method
  public void sleep(){ // person 的abstract method
    System.out.println("I am student,sleeping");
  }
  
  public void read(){// Adult 的abstract method
    System.out.println("I am student, reading");
  }
////////////////////////////////////////
  public static void main(String[] args) {
    Student student = new Student();
    student.sleep();
    student.read();
    student.run();
    student.eat();
    System.out.println(student.getAge());//0
  }
}
