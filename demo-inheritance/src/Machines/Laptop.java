package Machines;

import java.util.Objects;

public class Laptop extends Machine{ // Machine describle 緊重量，有start,stop，laptop繼承machine佢
  //是在machine基礎上再describle Machine是抽象
  // student extends person ; father extends parents
  //Laptop is subclass(child), Machine is superclass(parent)
  // Inherit Machine attribute ("double weight")
  // Inherit Machine methods(start() and stop() )
  private Keyboard keyboard;
  private Monitor monitor; // Keyboard同monitor同Machine無關係

  private int volume;

  //subclass constructor must call one of superclass constructors

  public Laptop(){ //machine無寫到即有empty constructor
    // 背後call 緊super();//new Machine();
    // super(1.0d);
    // new laptop呢個object 包住左個Machine,weight係痴住個細波，只不過大波laptop可以直接用
    //implicitly call superclass empty constructor (call左個machine constructor)
    // new Machine()
  }

public Laptop(Keyboard keyboard, Monitor monitor){ // 佢都有call到 machine empty constructor
  //implicitly call superclass empty constructor,laptop入面new左個machine
  this.keyboard=keyboard;
  this.monitor=monitor;
}

public Laptop(String buttonType,int noOfButton,double length,double width){
  //implicitly call superclass empty constructor
  // use can new a laptop by using these 4 variables.//爆返出黎
  this.keyboard=new Keyboard(buttonType, noOfButton);
  this.monitor= new Monitor(length, width);
}

public Laptop(double weight,Keyboard keyboard,Monitor monitor){// 想set埋個weight
  super(weight);// call緊 new Machine(5); explicit call緊，一定放第一句，有老豆D野call左先
  // super()+this.setWeight(weight);
  //new Machine(); <整左個object但無野指住佢
  //this.weight=weight
  // super();
  // this.setWeight(weight);
  this.keyboard=keyboard;
  this.monitor=monitor;
}

@Override
public boolean equals(Object o){
  if(this==o)
  return true;

  if(!(o instanceof Laptop))
  return false;

  Laptop laptop = (Laptop)o;
return Objects.equals(laptop.keyboard, this.keyboard) //點為之 same keyboard  keyboard.equals(this.keyboard)，keyboard又要寫equals
    && Objects.equals(laptop.monitor, this.monitor);
}

@Override // Method Overriding, complier會check parent 有無start method, method繼承左
// if 無 >> error
public void start(){
  super.start();// Machine start...
  System.out.println("Laptop Start....");
}
@Override // Method Overriding, attributes繼承，method先係override(但無必要override get setter)
public void stop(){
  System.out.println("Laptop Stop...");
}
// You cannot override the final method in superclass
// public static String staticMethod(String x, String y){ // 老豆final左，個仔就唔可以override
//   return 
// }

public void mute(){//屬於laptop的method
  this.volume=0;
}
public static void main(String[] args){
  //Laptop laptop88 = new Machine(2.0);
  Laptop laptop = new Laptop("abc",100,15,10);
  laptop.getWeight(); // 0.0 defaullt value
  laptop.setWeight(3.0d);
  System.out.println(laptop.getWeight());// 3,0
  laptop.start(); // Laptop Start...,無override出Machine
  laptop.stop(); // Laptop Stop...

  Machine machine = new Machine(); //defaul左 weight = 0.0
  machine.setWeight(5.0d);
  System.out.println(machine.getWeight());// 5.0
  machine.start(); // machine start...
  machine.stop(); // machine stop...

  Laptop laptop2 = new Laptop();//empty constructor一樣有weight
  laptop2.setWeight(10.0d);
  System.out.println(laptop2.getWeight()); //10.0

  Laptop laptop3 = new Laptop();
  System.out.println(laptop3.getWeight());//1.0
  System.out.println(Machine.staticMethod("abc", "def"));//abcdef，static應該直接用class去,
  System.out.println(Laptop.staticMethod("abc","def")); //ancdef，個仔用老豆公家static
//  laptop3.staticMethod("abc", "def");//abcdef 用地址去搵公家野，轉左個圈，但照call到的
 //not recommended

 // final > method, class, variable
}
}
