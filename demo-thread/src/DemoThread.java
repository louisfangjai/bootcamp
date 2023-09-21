public class DemoThread {
  public static void main(String[] args) {
    
    //Task logic
    // Approach 1 lambda
    Runnable printout =()->{
      for(int i =0;i <1;i++){
        System.out.println("i = "+i);
      }
    }; //step4
    // Run 是無入無出
    
    // Thread -> Task
    Thread thread = new Thread(printout); // Task Management 將個task logic printout放入去管理員
    System.out.println("start thread1"); //step 1
    thread.start(); //step2，做分離// start枝thread
    System.out.println("end thread1"); //step3

    //Approach 2 : Create PrintOut Class implement Runnable
    Thread thread2 = new Thread(new PrintOut());
    System.out.println("start thread2"); //step 1
    thread2.start(); //step2，做分離// start枝thread
    System.out.println("end thread2"); //step3

    //Approach 3: Create PrintOut2 Class extends Thread
    PrintOut2 thread3 = new PrintOut2();
    thread3.start(); // Approach 3 : extends thread

    try{
      thread.join(); //行到 等埋thread先
      thread2.join();
      thread3.join();
    } catch (InterruptedException e){

    }
    System.out.println("Main Thread Ends");
  }

}
