package queue1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
    List<String> s = new ArrayList<>();
    s = new LinkedList<>();

    s.add("abc");


    LinkedList<String> queue = new LinkedList<>(); // deque家族 有list 同queue，體驗queue(水管)
    // First In First Out
    queue.add("hello");
    queue.add("world");
    // queue.get <無get, depends on你想點做，佢封左你中間入去access
    // Queue,hashset,array list > String array
    queue.peek();//望一望個element(下一個出黎)
    System.out.println(queue.peek()); //hello
    System.out.println(queue.poll());//hello
    System.out.println(queue.poll());//world
    System.out.println(queue.size());// 0
    
    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def")); // true，亦都remove左
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); //xyz

    System.out.println(queue.offer("ijk")); // true,add()
    System.out.println(queue.offer("abc")); // true,add()
    System.out.println(queue.offer("ijk")); // true,add()
    System.out.println(queue.size());//3
    System.out.println("head:" + queue.peek()); // ijk


    if(queue.contains("ijk")){ //true
        queue.remove("ijk"); // remove first occurence of element
    }
      // for(String str:queue){ // 左手邊拎出黎野 , for each 無index用for each
      //   System.out.println(str); // abc ijk
      // }
      LinkedList<String> backup = queue;
      while(!queue.isEmpty()){ // queue配合while loop，一路拎野拎到無為止
        System.out.println(queue.poll()); // abc ijk
      }
      System.out.println(backup.size());//0 (佢一直point住個address)

      LinkedList<Integer>queueNum = new LinkedList<>();
      queueNum.add(10);
      queueNum.add(10);// 2nd even number
      queueNum.add(9);
      queueNum.add(0); 
      queueNum.add(-3);
      queueNum.add(100);
      // 10,9,-3,100

      //int first = queueNum.peek(); // first =10
     // boolean firstTime= true;
    int countEven = 0;
    int element = 0;
    System.out.println("Start");
    int size = queueNum.size(); // 6
    int i = 0;
    while (i++ < size) { // 0,1,2,3,4,5 < 6
      element = queueNum.poll();
      if (element % 2 == 0 && ++countEven == 2)
        continue;
      queueNum.add(element);
    }
    System.out.println(queueNum);
  }
}
