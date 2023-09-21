import java.util.HashSet;
import java.util.Set;

public class DemoRecord {
  public static void main(String[] args) {
    Person person = new Person("Andy",18);
    Person1 person1 = new Person1("Oscar",18);
    Person1 anotherPerson = new Person1("Oscar",18);

    
    System.out.println(person.getAge()); //18
    System.out.println(person1.age()); //18

    System.out.println(person.getName()); 
    System.out.println(person1.name());
    
    System.out.println(person1.equals(anotherPerson));//true 佢override左個equals
    System.out.println(person1); //Person1[name=Oscar, age=18]
    
    System.out.println(person1.hashCode() == anotherPerson.hashCode());// true, 真係override左，出same hashCode

    // HashMap,Set -> equals(), hashCode
    Set<Person1> set = new HashSet<>();
    set.add(person1);
    System.out.println(set.add(anotherPerson));// false，證明佢認到duplicate


  }
}
