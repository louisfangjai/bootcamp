package NOTES;
//


public class Catsa extends Animalabstract {
  
  public String name;

  public Catsa (){

  }
  public Catsa(String name){
    this.name="XYZ"; // this.name唔係一定this.name=name咁寫，可以其他野
  }
  @Override
  public void makesound(){
    System.out.println("Cat overriden abstract method");
  }
  
  
  public static void someStaticMethod(){
    System.out.println("cat static method");
  }

  public static void main(String[] args) {
    Catsa c1 =new Catsa("ABC");
    c1.makesound();
    c1.sleep();
    c1.doNothing();
    System.out.println(c1.name);//ABC
    Catsa.someStaticMethod();
    Animalabstract.someStaticMethod();
  }

}
