public class TestStringBuilder {
  public static void main(String[] args) throws InterruptedException{
    
  
  StringBuilder sb  = new StringBuilder("");
  StringBuffer sb2 = new StringBuffer(); // 慢左，因為synchronized左 mult-thread可操作
  // sb (reference) -> object (StringBuilder Object) -> object(array)
  // no magic, string> charArray


  Runnable appendS = () -> {
    for(int x=0;x<100;x++){
     sb.append("s");// Non-atomic operation > i.number++
      // 
    }
  };

  Thread thread1 = new Thread(appendS);
  Thread thread2 = new Thread(appendS);
  //Thread thread3 = new Thread(increment);

  thread1.start();
  thread2.start();
  //thread3.start();

  //try{
    thread1.join(); // join即是等埋
    thread2.join();
  //} catch(InterruptedException e){

 // }
  System.out.println(sb.length()); //不是200，被人入侵左 //// java.lang.ArrayIndexOutOfBoundsException

  }
}
