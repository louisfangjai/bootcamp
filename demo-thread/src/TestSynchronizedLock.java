public class TestSynchronizedLock {
  
  int x;
  Object lock1 = new Object();
 

  public int calculate(int amount){
    int total = amount;
    synchronized(this.lock1){
      this.x++;
    }
    
    // codes...
    // Can be more than one synchronized code block
    // 因為直接鎖method有機會鎖得太多code
    // synchronized (this.lock){
    //    this.x++;
    //}
    return total+this.x;
  }

  // public synchronized void increment(){ // 框住最少的部分
  //   this.x++;
  // }
  public static void main(String[] args) {
    TestSynchronizedLock obj = new TestSynchronizedLock();

    Runnable formula = ()->{
      for(int i=0;i<10000;i++){
        obj.calculate(0);
      }
    };

    Thread thread1 = new Thread(formula);
    Thread thread2 = new Thread(formula);
    thread1.start();
    thread2.start();
    try{
      thread1.join();
      thread2.join();
    }catch(InterruptedException e){

    }
    System.out.println(obj.x); //不是二百萬
  }
}
