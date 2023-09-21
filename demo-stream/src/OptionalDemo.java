import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
  
  public static void main(String[] args) {
        // One Table(Persons) -> Many Records....(where age >60) 拿DATA
    // Test getFromdb
    // result

    System.out.println(StreamDemo.getFullNames("Lau"));
    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person p1 = new Person("Ann Chan",addresses);

    List<String>addresses2 = new ArrayList<>();
    addresses.add("Taiwan");
    addresses.add("US");
    Person p2 = new Person("Betty Chan",addresses2);


    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getFromDb(persons,"Chan")); // true
    System.out.println(getFromDb(persons,"Lau")); // false

    Optional<Person> result =getFromDb2(persons,"Chan");
    result.ifPresent(person->{
      persons.getAddress().stream()//
      .forEach(addr->{
        System.out.println(addr);
      });
    });

  }

  public static boolean getFromDb(List<Person>person//
  , String lastName){
    return person.stream()//
    .filter(p->p.getName().endsWith(lastName)) // Stream
    .findAny() // Optional<Person>
    .isPresent();
  }

    public static Optional<Person> getFromDb2(List<Person>person//
  , String lastName){
    return person.stream()//
    .filter(p->p.getName().endsWith(lastName)) // Stream
    .findAny(); // Optional<Person>
   
  }
}
