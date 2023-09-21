import java.util.ArrayList;
import java.util.Collections;

public class Boxg<T extends Number> { //any class extending Object
  
  private ArrayList<T> numbers;
///////////////////////////////////
  private Boxg(){
    numbers= new ArrayList<>();
  }

  public Boxg(T number){
    // numbers= new ArrayList<>();
    this(); // call the empty constructor of Class Boxg
    numbers.add(number);
  }

  public ArrayList<T> getNumbers(){
    return this.numbers;
  }

  // public void setNumbers(T[] numbers){
  //   this.numbers=numbers;
  // }

  public void add(T number){
    numbers.add(number); // null pointer
  }

  public int size(){
    return numbers.size();
  }
  public static void main(String[] args) {
    //Box<String> box1 = new Box<>(); // 佢限制左T要extends左Number
    Boxg<Number> box1 = new Boxg<>(100);// compile-time check，你放<String> 會紅 (delcare果下都封死)
    System.out.println(box1.size());//1
    // Boxg<Number>是一個type，不可以再assign box1去其他野
    // box1 = new Box<>("abc");  < new Box<>("abc")  is not Box<Number>
    //However,
    box1 = new Boxg<>(1000); // is okay

    Collections.sort(null, null);



  }

}

