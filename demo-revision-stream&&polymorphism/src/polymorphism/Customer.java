package polymorphism;
public class Customer extends Human implements Orderable{

  public static int counter=0;

  public Customer(String name){
    super(name);
  }

  

  @Override
  public void order(){
      counter++; //instance 的野可以操作 static但相反唔得
  }

  public void humanOrder(){
    super.order();
  }
}
