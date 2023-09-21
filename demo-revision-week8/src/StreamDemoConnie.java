import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDemoConnie {
  public static void main(String[] args) {
    // One Table (Persons)
    System.out.println(getFromDb("Lau").toString()); // [Person(name= Eric Lau), Person(name= Peter Lau)]
    System.out.println(getFromDb("Chan").toString()); // [Person(name= John Chan)]

    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("US");
    addresses.add("Japan");
    Person p1 = new Person("Ann", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person p2 = new Person("Betty", addresses2);

    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println("flatMap: " + getAllAddresses1(persons)); // [Hong Kong, US, Japan, Taiwan, US]
    System.out.println("map: " + getAllAddresses2(persons)); // [[Hong Kong, US, Japan], [Taiwan, US]]
    System.out.println("non-stream w/ 2 loops: " + getAllAddresses3(persons)); // [Hong Kong, US, Japan, Taiwan, US]
    System.out.println("non-stream w/ 1 loop: " + getAllAddresses4(persons)); // [[Hong Kong, US, Japan], [Taiwan, US]]
    // return all addresses (List<String>) from List<Person>
    System.out.println(getAllNames(persons));

  }

  public static List<String> getAllNames(List<Person> persons) {
    return persons.stream()
      .map(e -> e.getName())
      .collect(Collectors.toList());
  }

  // - - 1. flatMap()
  public static List<String> getAllAddresses1(List<Person> persons) {
    return persons.stream()
      .flatMap(e -> e.getAddresses().stream())
      .collect(Collectors.toList());
  }

  // - - 2. map()
  public static List<List<String>> getAllAddresses2(List<Person> persons) {
    return persons.stream()
      .map(e -> e.getAddresses())
      .collect(Collectors.toList());
  }

  // - - 3. loop (non-stream)
  public static List<String> getAllAddresses4(List<Person> persons) {
    List<String> addresses = new ArrayList<>();
    for (Person p : persons) {
      addresses.add(p.getAddresses().toString());
    }
    return addresses;
  }

  public static List<String> getAllAddresses3(List<Person> persons) {
    List<String> addresses = new ArrayList<>();
    for (Person p : persons) {
      for (String address : p.getAddresses()) {
        addresses.add(address);
      }
    }
    return addresses;
  }


  public static List<String> getFullNames(String lastName) {
    // Call Database, and returned a List of Person
    // SQL -> filter by lastname (where list_name = lastName)
    List<Person2> persons = new ArrayList<>();
    persons.add(new Person2("John Chan"));
    persons.add(new Person2("Eric Lau"));
    persons.add(new Person2("Peter Lau"));
    return persons.stream()
      .filter(e -> e.getName().endsWith(lastName)) // p means T (T -> Person)
      .map(e -> {
        return e.getName(); // Conversion: from List<Person> to List<String>
      })
      // .map(e -> e.toString())
      .collect(Collectors.toList());
  }

  public static List<String> getFullName2(String lastName) {
    List<Person2> persons = new ArrayList<>();
    persons.add(new Person2("John Chan"));
    persons.add(new Person2("Eric Lau"));
    persons.add(new Person2("Peter Lau"));

    // filter + map
    List<String> names = new ArrayList<>();
    for (Person2 p : persons) {
      if (p.getName().endsWith(lastName)) {
        names.add(p.getName());
      }
    }
    return names;
  }

  public static List<Person2> getFromDb(String lastName) {
    // Call Database, and returned a List of Person
    List<Person2> persons = new ArrayList<>();
    persons.add(new Person2("John Chan"));
    persons.add(new Person2("Eric Lau"));
    persons.add(new Person2("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream()
    .filter(e -> e.getName().endsWith(lastName))
    .collect(Collectors.toList()); // List<Person>
    //.toList();
  }
}