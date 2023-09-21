public class TestSynchronized {
  
  int number;

  public synchronized void increment(){ // Like a "Atomic" method但不是
    this.number++; // non-atomic operation
  }

  public static void main(String[] args) {
    TestSynchronized t = new TestSynchronized();

    Runnable formula = ()->{
      for(int i=0;i<1000000;i++){
        t.increment();
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
    System.out.println(t.number); //不是二百萬
  }
}
