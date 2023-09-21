public class Dog extends GameMember implements Move { //extends彈性好差只可以一個，佢唔想你撞曬METHOD，所以仔>老豆>媽，同一個LEVEL EXTENDS兩個就唔知點算
  //，EXTENDS左佢就會多左ATTRIBUTES
  // 但IMPLEMENTS CONTRACT只是METHOD 但你可以唔用

   //int score=0;
   String name;
  
  @Override
  public void jump(){
    super.addScore(3);
  }
  @Override
  public void bigJump(){ // 因為move繼承左BigMove

  }
  @Override
  public void up(){
      System.out.println("Moving up");
      super.addScore(2);
      //GameMember.up(this);
  }
  @Override
  public void down(){

  }
  @Override
  public void left(){

  }
  @Override
  public void right(){
    
  }
  public static void main(String[] args) {// print GameMember or move都有，會跟邊個
    Dog dog = new Dog();
    dog.print();//print() from GameMember or Move? from GameMember，父母重要過合約!!
  }
}
