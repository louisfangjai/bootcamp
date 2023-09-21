package papercard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ds.SortByDecending;

public class Card extends Paper{

  int number;
  
  public Card(int number,int size){
    super(size);
    this.number=number;
  }
  

  @Override//Compiler，若無Override便當你自己method
  public String toString(){
      return "Card [number = "+this.number//
      + ", size = "+super.size//
      +"]";
  }
  public static void main(String[] args) {
    List<Card> cards = Arrays.asList(new Card(1, 2),new Card(4, 3)); // 只是List的存在，無add/remove
    Collections.sort(cards,new SortBySize());
    System.out.println(cards);

    List<Short> shorts = new ArrayList<>();
    shorts.add((short)2);
    shorts.add((short)1);
    shorts.add((short)3);
    Collections.sort(shorts);
    System.out.println(shorts);

    List<String> strs = new ArrayList<>();
    strs.add("#sty");
    strs.add("sty");
    strs.add("abc");
    strs.add("Aef");
    strs.add("xyz");
    //Collections.sort(strs, new SortByDecending());
    System.out.println(strs);

    List<? extends Number> numbers = new ArrayList<Integer>(); //左邊無寫死，右邊可以寫
    // ? -> T 是不OK，T不可以在MAIN 出現
      numbers = new ArrayList<Double>();
      //numbers.add(1); // At compile-time, type-safty issue
      // numbers.add(1.0d); // At compile-time, type-safty issue
    //  List<Number> numbers = new ArrayList<Integer>(); <是不OK的
    // List<Number> numbers2 = new ArrayList<Integer>(); 
    // numbers2= new ArrayList<Double>();
  

    Number number = new Integer(300); // Polymorthism
    number = Integer.valueOf(10);
    number = new Double(2.0);  // Polymorthism
    number = Double.valueOf(2.0);
    //因為valueOf有internal Cache ，佢建議你用
    //Polymorthism number=可以Integer.valueOf , Double.valueOf

     List<? extends Integer> test1 = new ArrayList<Integer>();
     // test1 = new ArrayList<Number>();

     List<? super Integer> test2 = new ArrayList<Integer>();
     test2 = new ArrayList<Number>();
     test2 = new ArrayList<Object>();

}


}
