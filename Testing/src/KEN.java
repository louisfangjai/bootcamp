import java.util.Random;

public class KEN {
  
  String name;
  int age;

  public KEN (){
    
  }
  public void setName(String name){
    this.name= name;
  }

  public static void main(String[] args) {
    System.out.println(new Random().nextInt(49)+1);
    System.out.println(new Random().nextInt(49)+1);
    System.out.println(new Random().nextInt(49)+1);
    System.out.println(new Random().nextInt(49)+1);
    System.out.println(new Random().nextInt(49)+1);
    System.out.println(new Random().nextInt(49)+1);
  }
}
