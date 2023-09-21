// Before Java 8, 100 abstraction (完全抽象)
public interface Move extends BigMove { 
  //extends諗抽象一格

  // NO instance variable->camlcase，因為唔係呢個用途

  //Constant
  static final int MAX_SPEED =10; // ，會大寫 ，廢事亂係variable implicitly public 

  //Java -> naming convention ->Camlcase
  //"noOfDay"

  // Behavior
  void jump(); //public abstract
  
  //No method implementions

  //After Java 8, lamba,stream
  default void print(){ //instance method, implicitly public
    System.out.println("I am Java 8 default method");
  }// default唔想你紅，兼容性，影響唔到其他class

  static String concat(String a, String b){ // interface都有static method
    return a+b;
  }

}
