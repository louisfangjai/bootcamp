package swimable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Run {
  int run();
}

@FunctionalInterface // 1個method
// if no ,compile-error
// Annotation: check if this interface has one abstract method only//一個
public interface Swimable {
  void swim();
  // void read();


  // 即使唔寫 @FunctionalInterface 佢都當你係，似@override
  public static void main(String[] args) {
    // Comparator得一個method FunctionalInterface
    // Lambda: You have to use "return",if you use{}
    Comparator<Person> sortByNameDesc = (Person p1, Person p2) -> { //set comparator
      return p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
    };

    List<Person> persons =
        Arrays.asList(new Person("Alison"), new Person("Eric"));
    Collections.sort(persons, sortByNameDesc);
    System.out.println(persons);// [[name=Eric], [name=Alison]]
    // persons.add(new Person("ss")); run time error
    System.out.println(persons); // [[name=Eric], [name=Alison]]
    // Person person = new Person();
    // person.swim(); <返工唔會咁寫
    Person p2 = new Person("as");
    p2.swim(); //override左 //Person is swimming


    // new object <- "()-> System.out.println("Person am swimming");"
    Swimable person1 = () -> System.out.println("Person1 is swimming");
    // () depends on swim的 ()
    // -> //
    person1.swim(); //佢個swim係無野

    Swimable person2 = () -> {
      System.out.println("Person 2 start to swim");
      System.out.println("Person 2 stop swimming");
     // return; //{> 要寫returrn
    };
    person2.swim();

    Swimable person3 = () -> {
      System.out.println("Person 3 start to swim");
    };
    person3.swim();
    // person1 vs person3 得一句 {} 可寫可唔寫
    // 如果interface得一個method，得個class implemnts佢 <唔洗特登整個class
    // lambda

    Run run = () -> {
      int a = 3;
      return a + 2;
    };

    Run run2 = () -> 1 + 2;

  }
}
