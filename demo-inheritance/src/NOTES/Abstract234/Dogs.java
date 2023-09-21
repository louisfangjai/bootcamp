package Abstract234;

public class Dogs extends Animal{
  
  public Dogs(){
    
  }
  public Dogs (String name){
    this.name=name;
  }
  @Override
  public void doSomething(int x, int y){
    System.out.printf("x is %s, y is %s\n",x,y);
  }
  public static void main(String[] args) {
    Dogs dog = new Dogs();
    dog.doSomething(3, 4);
  }
}
