package queue1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;
import javax.management.MBeanParameterInfo;

public class DemoArrayDeque {

  // ArrayDeque底層是Array
  // LinkList底層是linklist，是另一種方式的Array
  // Array是相鄰的(入面的野附近，memory上搵到個頭就OK)，再reasign是斬過
  // Linklist成條野唔洗 頭中尾痴住，蛇頭...蛇中...蛇尾..，如果Del唔洗成條唔要
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll()); //abc
    System.out.println(strings.size()); //2
    strings.addLast("xyz"); // addLast()=add()
    System.out.println(strings.poll()); //def
    strings.addFirst("ijk"); // head 打尖，只可以頭尾，唔可以中間
    System.out.println(strings.peek()); //ijk
    System.out.println(strings.pollFirst());// ijk, head, poolFirst() = poll()
    System.out.println(strings.pollLast());// xyz
    // add隊尾排位，poll頭位拎野
   
    LinkedList<String> list = new LinkedList<>(); // readability好低，但technically都可以咁寫
    // What is the difference??
    Deque<String> deque = new LinkedList<>(); // Polymorhism-->多變
    Queue<String> queue = new LinkedList<>(); // Polymorthism
    //右手面可以Implements多張合約，Linkedlist implements deque 即 deque的method , LinkedList都有
    // Deque extends queue, interface design得好>將範圍收窄令readabily上升
    // Queue隊頭拎野放野，Deque兩頭拎野放野
    //左手面 用黎收窄range(範圍), adv:一睇就知用咩功能想點，右手面係最勁ge野 點樣implement最基本範圍
    queue.add("abc");
    deque.add("abc");
    deque.addFirst("def");
    deque.addLast("ijk");
    
    run1(new LinkedList<>()); // 底層linkedlist
    run1(new ArrayDeque<>()); // array
    // run1(new PriorityQueue<>()); // compile-error

     run2(new LinkedList<>()); // 底層linkedlist
    run2(new ArrayDeque<>()); // array
     run2(new PriorityQueue<>()); //
    // 3個性能上唔一樣，功能上都唔同，
  //左手(Delcaration)邊唔變，右手邊變, 09/08/2023 1hr
  // Array read野快D
      Collection<String> arraylist = new ArrayList<>();
      List<String> list3 = new LinkedList<>(); // hide deque methods
      //淨係用List果邊的METHOD。
      //用collection去接，佢可以放好多野入黎，但一有sequence就唔掂，就咁add就得
  }
  public static int run3(Collection<String>collection){
    collection.add(null);
    collection.add(null);
    collection.add(null);
    collection.add(null);
    return collection.size();
  }

  public static void run1(Deque<String> deque){ //封死
    deque.add("as");
    deque.add("ss");
  }
      public static void run2(Queue<String> queue){
    queue.add("as");
    queue.add("ss");
  }
  // Point 1 範圍readability 清晰表達!
  //point 2 限制user provide的 in put data, 由用家決定performance(鎖定performance)
  //point 3

}
