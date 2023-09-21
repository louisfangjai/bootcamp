package printer;

import java.util.ArrayList;
import java.util.List;

// Generic
// T means咩都得，line3比唔到個type你，到用果陣先講咩type
public class Printer<T> { 
// 1. Class Signature, add <>, T represent any Type   << describle果陣 唔知咩黎
T value; // T is a any type of class，complie time check到的野，會check到咩
        // T is not a class
T []number;
Object object; // object是咩都無，你放咩都得，但拎出黎唔是咩都得

//Object 係真實存在class，但T不是一個class
//由用家決定個T
public T getValue(){
  return this.value;
}

public void setValue(T value){
  this.value=value;
}
public Object getObject(){
  return this.object; // parent 之後又要down cast，你get object無method
}
public void setObject(Object object){
  this.object=object;
}
public void print(){
  System.out.println(this.value);
}
  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>(); //用家決定<String>
    // Strong Type checking ---> check if you put a real class into <>
    p1.setValue("abc");
    System.out.println(p1.getValue().charAt(2));//c

     Printer<Integer> p2 = new Printer<>(); //用家決定左Integer
     p2.setValue(100);
     System.out.println(p2.getValue());//100

     Printer<Double> p3 = new Printer<>(); // 用家沖定
     p3.setValue(2.3);
     System.out.println(p3.getValue()); // 2.3

     Printer p4 = new Printer<>(); //無入鑽石<> 會當左係Object // Printer <Boolean> p4
     //所以你setValue set咩都得(boolean, char....)
     p4.setObject("String");
     p4.setValue(true);
     //p4.setValue('a');
     System.out.println(((String) p4.getObject()).charAt(0)); // S
     System.out.println(p4.getValue());//true
     // downcast只是String 有method
     // compile time可以 charAt但 runtime唔得
     List list = new ArrayList<String>();
     list.add('a');
     //String str = (String) list.get(0); //用String接唔住個char
     //佢無紅線但會 run time error
  }

}

