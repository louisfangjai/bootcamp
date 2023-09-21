public record Person1(String name,int age) implements TestInterface{
  // Person1 <T>

  // Immutable不可改變的 Objects(唔比人set) (背後佢final左D instance variables, set唔到name,age)
  // final class, support Generics (佢背後係final class 唔比人extends佢)
  // Support Interface, but cannot further extend other Class (extends Object.class)
  // public void setName(String name){
  //   this.name=name;
  // }
  // Private final String name;
  // private final int age;
  // All-args constructor ONLY // No empty
  // All Getters
  // No Setters (final instance variable)
  // custom static methods, static variables
  // custom constant
  // custom instance methods
  // No other instance variable
  // Already @Override equals(),hashCode(),toString()

  //int salary; < Control黎，唔可以起新variable,setter
  // 個普通class再final，易比人改

  static int counter = 0; // class variable, not belongs to object

  static final int MAX_VALUE = 100; // constant
  static final int MIN_PAY = 50; // constant


  public boolean isElderly(int age){ // instance method
    return age >= 65;
  }
  
  @Override
  public void read(){

  }
  // Tools
  public static int add(int x, int y){ // static method
    return x+y;
  }


}
