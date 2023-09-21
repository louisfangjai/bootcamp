import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {

  AtomicInteger number = new AtomicInteger(0);// 原子性
  public static void main(String[] args) {
    TestAtomic i = new TestAtomic();
    // i.number++; // Non-atomic Operation，原子性>原子無得再細分>可被入侵
    // // i.number果陣係要時間，非原子性> 中間過程可被thread入侵// or i = i+2
    // System.out.println(i.number); //1 

    Runnable increment = () -> {
      for(int x=0;x<1000000;x++){
        i.number.incrementAndGet();// Atomic operation > i.number++
        // 鎖門你做慢左
      }
    };

    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment);
    //Thread thread3 = new Thread(increment);

    thread1.start();
    thread2.start();
    //thread3.start();

    try{
      thread1.join(); // join即是等埋
      thread2.join();
    } catch(InterruptedException e){

    }
    System.out.println(i.number);
  }
}
