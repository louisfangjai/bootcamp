import java.util.ArrayList;

public class Database<T extends Number> { // super不可以簽名
  ArrayList<T> data;

  public boolean add(T data){
   return false;
  }

  public static<S> S add(S data){ // static 個T唔同的 同上面<T extends Number> (同個class)個T 是無關係的
    return data;
  }
  // 個S唔受Number去影響

  public static ArrayList<?> add(ArrayList<? super Integer> data){
    return data;
  }
  public static <T> String add2(T data){
    return "";
  }
 
}
