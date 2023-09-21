package ds;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  
  public static void main(String[] args) {

    // Priority : natural order by default
    Queue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add ("abc");
    queue.add("def");
    System.out.println(queue.poll());// 出abc // not bcd

    // Priority: Custom Priority by Comparator
    Queue<String> custom = new PriorityQueue<>(new SortByDecending()); //佢唔想你add每次轉
    custom.add("bcd");
    custom.add ("abc");
    custom.add("def");
    System.out.println(custom.poll());// def
    System.out.println(custom.poll());
  }
}
