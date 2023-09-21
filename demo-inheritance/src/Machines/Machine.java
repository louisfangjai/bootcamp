package Machines;
public class Machine { // machine common factor

  private double weight; // 唔寫CONSTRUCTOR MEANS THERE IS A EMPTY CONSTRUCTOR
  
 public Machine(){
  
 }
 
  public Machine(double weight){
this.weight=weight;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setWeight(double weight){
    this.weight=weight;
  }
  public void start(){ //定義 void method
    System.out.println("Machine Start ...");
  }

  public void stop(){
    System.out.println("Machine Stop ...");
  }

  public static final String staticMethod(String x, String y){
      return x+y;
  }
  // Integer ,primitive 簡單唔洗理null，少D危機，易read
  // String 要cheeck好多野，wrapper class同樣是，易錯

  //Factory Pattern
  public static Machine produce(int code){//只可以用Machine接住，但唔可以用laptop接住
    switch(code){
      case 1:
      return new Machine();
      case 2:
      return new Laptop(); // return sub-class
    }
    return new Machine();
  }

  public static void stop(int code){ // what machine going to stop???
    Machine machine = Machine.produce(code);
    machine.stop();// different child class will have different implemental

  }

  public static void main(String[] args) {
    int pocketmoney = 100;
    boolean stopCondition = pocketmoney < 0; //??
    int code =1;
    if(stopCondition){
      Machine.stop(code); // Machine stop...(你唔知咩machine stop緊)
    }
    Machine machine1 =Machine.produce(1);//Machine
    machine1.stop();// Machine Stop...
    Machine machine2 = Machine.produce(2);// Laptop
    machine2.stop(); //Laptop Stop...// 仔method
  }
}
