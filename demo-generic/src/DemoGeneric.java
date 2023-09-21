import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import box.Boxg;
import person.Person;
import zoo.Animal;
import zoo.Cat;
import zoo.Dog;
import zoo.Zoo;

public class DemoGeneric {
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();


    //Animal example
    Zoo<Dog> zoo1 =Zoo.of(Dog.of("xyz"));//淨係dog的Zoo
    zoo1.setAnimal(Dog.of("def"));
    //zoo1.setAnimal(new Cat()); compile error, strong type check, cat 無of method
    
    Zoo<Animal>zoo2 = Zoo.of(new Cat());
    zoo2.setAnimal(new Animal());
    zoo2.setAnimal(Dog.of("abc"));// Dog extends Animal
    zoo2.setAnimal(new Cat()); // ?


    //Zoo<String> zoo3 = Zoo.of("Abc");// String is not extending Animal // new Zoo<>("abc"); -> private又無empty

    //Normal example
    Boxg<Integer> box = getBoxg(Integer.valueOf(100));

    // Special example
    Object object = getBoxg(Double.valueOf(1.0d));
    // Object object <-- Box<Double>
    Boxg<Double> d1 = (Boxg<Double>)object;//
    for(double d: d1.getNumbers()){
      System.out.println(d); //1.0
    }
    List<Person> strings3 = new ArrayList<>(); // list也是一個generic
    Database<Integer> strings4 = new Database<>();// 其實一樣意思

    Database.add(new Person()); // static method is independent generics,個S唔受Number去影響

  }

  public static <T extends Number> Boxg<T> getBoxg(T element){
    return new Boxg<>(element);
}
}

