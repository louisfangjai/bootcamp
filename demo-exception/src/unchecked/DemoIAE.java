package unchecked;
public class DemoIAE {
  
  public static int add(int a, int b){
    if( a < 0|| b < 0)
    throw new IllegalArgumentException(); // throw出去
    return a + b;
  }

  public static void main(String[] args) {
   //try{
    add(1,4); //OK
    add(-1,5);// throw exception
    add(4, 5);// un-reachable 因為throw左
    
  // } catch (IllegalArgumentException e){
  //   System.out.println("Skip the process");
  // }
////////////////////////// 原意是想hold返正個program
  String s ="abc";
  System.out.println(s); // 若無try就唔會run到呢一步
}
}
