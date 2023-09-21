//Outer Class
//Can Access static nested class attribute

import java.util.ArrayList;
import java.util.List;

public class Student { // Outer class
  
private String name;
  // constructor, getter,setter,static method & Variable
private Bag bag; // 你決定寫唔寫成咁，唔關static class Bag

public Student(String name){
    this.name=name;
    bag = new Student.Bag(); // Bag Con
  }

// method -> Bag.method, instance variable,  bag belongs to student
public int getBagSize(){
  return this.bag.getSize();//new左個bag就可以用bag ge getSize method
}

public void clearBag(){
  // Outer Class access "Static nested class" static method
  Bag.clear(this.bag); 
}

public static int add(int a, int b){
  return a+b;
}

public String getName(){
    return this.name;
  }
@Override
public String toString(){
  return "Student [name ="+this.name//
        +", Bag["+ this.bag+"]"//
        +"]";
}
  //static nested class> static class即是獨立，Bag對於Student是獨立的，但放係Student入面，想話是屬於Student
  // Cannot Access Outer Class Attribute
  private static class Bag{ // Bag private，對外是new到student但不是bag
     int size;
    List<String> strings;
    // constructor
    // getter, setter
    // instance method
    public int getSize(){
      return this.size; // 講緊bag ge size
    }

    public void setSize(int size){
      this.size=size;
    }

    // static method & Variable
      public static void clear(Bag bag){
        bag.strings.clear();
        //add(1+3);//compile-error//入面CALL唔到出面
      }
      
      public void printStudentGrade(){ //調轉
        System.out.println();
      }

      public static void printHello(){
        Grade.printHello();
      }
    @Override
    public String toString(){
      return "Bag[ size ="+this.size//
      +", string="+this.strings//
      + "]";
    }
  }

  // inner class( non-static nested class)
  public class Grade { //獨立於 Student
     int score; // attirbute 唔set grade，因為score同grade有關係

     public int getScore() {
      return this.score;
    }
    // isMale(), isElderly()
    public char getGrade(){ // presentation用method
      switch(this.score){
        case 90:
        return 'A';
        case 80:
        return 'A';
        case 70:
        return 'A';
       default:
        return 'F';
      }
    }

    public Grade(int score){
      this.score=score;
    }
      public void printStudentName(){
        System.out.println(Student.this.getName());// Andy
      }

      public static void printHello(){
        System.out.println("Hello");
      }
  }
  public static void main(String[] args) {
    Student student1 = new Student("ANgus"); // Student's constructor
    Student.Bag bag1 = new Student.Bag(); // 係Student入面new左個bag，student1同 bag1是無關係的，是第屬於佢。// Bag's constructor
    System.out.println(student1.toString()); // name, bag

    Student.Grade grade = new Student("Andy").new Grade(70);//new左Student 用OBJECT去new野
    Student.Grade grade2 = student1.new Grade(70);
    grade.printStudentName();// Andy
    grade2.printStudentName();// ANgus

    List list = new ArrayList<>();
    list.add("abc");
    list.add(123);
    list.add('a');
    int a = (Integer) list.get(1); //(Integer> Object>Integer)
    System.out.println(a);
  }

}
//static>