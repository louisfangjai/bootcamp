public interface Move2 {

  default void print(){ //instance method, implicitly public
    System.out.println("I am Java 8 default method");
  }// default唔想你紅，兼容性，影響唔到其他class
}
