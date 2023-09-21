public class Ball {
  
  private Color color; // Color->Enum可以成為class的attribute
  // String-> "RE D","RED", "red","RE D " 有焗限

  public Ball(Color color){
    this.color=color;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public boolean equals(Object o){
    if (this==o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return this.color == ball.color;// 因為是enum 所以可以==(地址)
  }
  public static void main(String[] args) {
    Ball ball= new Ball(Color.RED); // set左color
    System.out.println(ball.getColor().name()); //RED

    // Object is topmost parent
    Object object = new Ball(Color.RED); // 紅字object is reference
    // compile-time : class "Object" type check 係compile-tim利用Object去check野
    object.hashCode(); // reference presentation,不是波的hashCode
    // Compile-time check if Object class has hashCode() method
    // compile-time check if Ball Class inherit Object

    // Run-time觸發 execute
    //Run-time object variable stores an address, point a Ball object in heap
    //Run-time determine if Class Ball has hashCode() method.
    // If no, then invoke Class Object hashCode() // 而家就係無hashCode()
    // If yes, invoke引用 (call) the Class Ball hashCode()

    //object = new Demo();
   
    System.out.println(((Ball)object).getColor()); // RED
    
    // Ball Class 有 getColor method，所以compile-time okay 假如係Ball就可以getColor
     Color color =((Ball)object).getColor(); // Compile-time type checking
     // Color extends Enum.class Enum extends Object.
     Class<?>clas = color.getClass(); //裝住個class
     System.out.println(clas.getName());//Color
     System.out.println(clas.toString());//class Color

     if(Color.BLUE.getClass() == Color.class) // true
     System.out.println("Color.BLUE is instance of Color");

      if(Color.BLUE instanceof Color) // true
     System.out.println("Color.BLUE is instance of Color");
    
    //SOFTWARE CPU
    Object o =1-'a'; //int or char? -> int -> Integer
    System.out.println("o = "+o);// 1-97> -96
    
    System.out.println(o.getClass().getName()); // java.lang.Integer
     System.out.println(o.getClass().toString()); // class java.lang.Integer

    Object o2 ='b';
    
    System.out.println(o2.getClass().getName()); // java.lang.Character
    // getName return String, getClass return class
    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName()); // Ball

    System.out.println(o3.getClass().isEnum()); // false
    //clas < Color (Enum)
    System.out.println(clas.isEnum()); //true

  }
}
