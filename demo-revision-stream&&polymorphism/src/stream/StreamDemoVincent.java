package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoVincent {
  public static void main(String[] args) {
    // One Table (Persons) -> Many Records (where age > 60)
    // Test getFromDb
    System.out.println(getFromDb("Lau").toString());
    // result: [Person(name=Eric Lau), Person(name=Peter Lau)]
    System.out.println(getFromDb("Chan").toString());
    // result: [Person(name=John Chan)]

    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person2 p1 = new Person2("Ann", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person2 p2 = new Person2("Betty", addresses2);

    List<Person2> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println("flatMap: "+getAllAddresses(persons));// [Hong Kong, Mainland, Japan, Taiwan, US]
    System.out.println(getAllAddressesc(persons));
    System.out.println(getAllAddressesc2(persons)); // 睇你地方去count 有string literal pool
    // return all addresses (List<String>) from List<Person>

    // without flatmap但做到相同野>foreach, List<Person2> -->person2-
    // List<List<String>>
    System.out.println("non-stream(flatMap,2 loop): "+getAllAddresses2(persons));
    //[Hong Kong, Mainland, Japan, Taiwan, US]
    
    // map
    System.out.println("map: "+getAllAddresses3(persons)); 
    //[[Hong Kong, Mainland, Japan], [Taiwan, US]] <--- 2個list of String
    // i.e. 1個入list入面裝住list of string
    // flatmap是將2個list打做一個list i.e. 1個list of string
    // non stream> map效果
    System.out.println("non-stream(Map, 1 Loop): "+getAllAddresses4(persons));

    System.out.println(getAllNames(persons)); // [Ann, Betty]
  }

  public static List<String> getAllNames(List<Person2> persons) { //可以睇print
    return persons.stream()
      .map(e -> e.getName())
      .collect(Collectors.toList());
  }


  public static List<Person> getFromDb(String lastName) {
  // Call Database, and returned a List of Person
  // SQL -> filter by lastname (where last_name = lastName)
  List<Person> persons = new ArrayList<>();
  persons.add(new Person("John Chan"));
  persons.add(new Person("Eric Lau"));
  persons.add(new Person("Peter Lau"));
  // Stream, last name = Lau
  return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName)) //
        .collect(Collectors.toList()); // List<Person>
  }
  
  // - - 1. flatMap()
  public static List<String> getAllAddresses(List<Person2> persons) {
    return persons.stream() //
        .flatMap(person -> person.getAddresses().stream()) // List<String> ->stream<String>
        .collect(Collectors.toList()); // size 2 List<List<String>>
  }
  ///////////////////////////////////////////////////////////////////////////////
    // Count!!!
    public static long getAllAddressesc(List<Person2> persons) {
      return persons.stream()//
          .flatMap(person -> person.getAddresses().stream()) //
          .collect(Collectors.toSet()) //
          .stream()// 也可以distinct -> count
          .count();
    }
      public static long getAllAddressesc2(List<Person2> persons) {
      return persons.stream()//
          .flatMap(person -> person.getAddresses().stream()) //
          .distinct()
          .count();
    }
    /////////////////////////////////////////////////////////////////////////////
    //non-stream FLATMAP效果，2 foreach loop (Flatmap)
    public static List<String> getAllAddresses2(List<Person2> persons) {
    // flatMap
    List<String> addresses = new ArrayList<>();
    for (Person2 p : persons) {
      for (String address : p.getAddresses()) {
        addresses.add(address);
      }
    }
    // map
     List<List<String>> addressLists = new ArrayList<>();
     for (Person2 p : persons) {
         addressLists.add(p.getAddresses());
     }
    return addresses;
  }

  // - - 2.map()
  public static List<List<String>> getAllAddresses3(List<Person2> persons) {
    return persons.stream()
      .map(e -> e.getAddresses())
      .collect(Collectors.toList());
  }  
  // NON STREAM MAP效果
  public static List<List<String>> getAllAddresses4(List<Person2> persons) {
     List<List<String>> addressLists = new ArrayList<>();
     for (Person2 p : persons) {
         addressLists.add(p.getAddresses());
     }
     return addressLists;
  }

  public static List<String> getFullNames(String lastName) {
    // Call Database, and returned a List of Person
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName)) // p means T (T -> Person)
        .map(p -> {
          return p.getName(); // Conversion: from List<Person> to List<String>
        }).collect(Collectors.toList()); // List<String>
  }

  // non stream-> same effect (foreach+if)
  public static List<String> getFullNames2(String lastName) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));

    // filter + map
    List<String> names = new ArrayList<>();
    for (Person p : persons) {
      if (p.getName().endsWith(lastName)) {
        names.add(p.getName());
      }
    }
    return names;
  }

  public static void print() {
    List<Person> persons = List.of(new Person("John"), new Person("Peter"));
    // Stream forEach()
    persons.stream() //
      .forEach(e -> {
        System.out.println(e.getName());
      });
    // for loop
    for (Person e : persons) {
      System.out.println(e.getName());
    }
  }
  
}
