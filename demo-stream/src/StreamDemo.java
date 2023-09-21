import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
  
  public static void main(String[] args) {
    // One Table(Persons) -> Many Records....(where age >60) 拿DATA
    // Test getFromdb
    System.out.println(getFromDb("Lau").toString());
    // result

    System.out.println(StreamDemo.getFullNames("Lau"));
    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person p1 = new Person("Ann",addresses);

    List<String>addresses2 = new ArrayList<>();
    addresses.add("Taiwan");
    addresses.add("US");
    Person p2 = new Person("Betty",addresses2);


    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getAllAddress2(persons));
    //[Hong Kong, Mainland, Japan, Taiwan, US]
    //return all addresses (List<String>) from List<Person>
  }
  
 
  public static List<String> getAllAddress(List<Person>persons){
    return persons.stream()//
      .flatMap(person->person.getAddress().stream()) // list<address>.stream() 再合併返 2個person的list of address
      .collect(Collectors.toList());
    // map只係將element炒埋一碟 flatmap就可以將一堆list炒埋一
    //也可以,discountcount
  }
  public static List<String> getAllAddress2(List<Person> persons){
    //flat map 拆箱
    List<String> addresses = new ArrayList<>();
    for(Person p: persons){
      for(String address : p.getAddress()){
        addresses.add(address);
      }
    }
      // //map -> 只不過將2條list<string> 放出黎，無 mix 埋
       List<List<String>> addressLists = new ArrayList<>();
       for (Person p2 : persons){
         addressLists.add(p2.getAddress());
       }
      return addresses;
  }
  public static List<String> getFullNames(String lastName){
    // Call Database, and returned a List of Person
    // SQL-> filter by ;astname(where last_name= lastName)
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream()//
      .filter(p->p.getName().endsWith(lastName))// p means T (T->Person)
      .map(p->{
        return p.getName(); // Conversion: from list<Person> to list<String>
      })
      .collect(Collectors.toList()); // List<String>
  }
public static List<String> getFullNames2(String lastName){
  List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));

    // 無stream情況下就要起empty list
    // filter + map
    List<String> names= new ArrayList<>();
    for (Person p:persons){
      names.add(p.getName());

    }
}
    public static List<Person> getFromDb(String lastName){
    // Call Database, and returned a List of Person
    // SQL-> filter by ;astname(where last_name= lastName)
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream()//
    .filter((p->p.getName().endsWith(lastName)))
    .collect(Collectors.toList()); // List<Persons>
  }
}
