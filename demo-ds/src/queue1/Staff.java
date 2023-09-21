package queue1;

public class Staff implements Walkable {
  @Override
  public void walk(){
    System.out.println("Staff is walking");
  }
  public static void main(String[] args) {
    Walkable person = new Staff();
    int a =100;
    if( a >10){
      person.walk(); //compile-time check
    }
  }
}
