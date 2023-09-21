package revision;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import javax.management.Query;

public class Demo {
  
  public static void main(String[] args) {
    // ArrayDeque & LinkedList < same level ( different underlying structure)
    Deque<String> arrayDeque = new ArrayDeque<>(); // array
    // arrayDeque 實際情況好少，正常add poll都係linked list
    
    arrayDeque.addFirst("a");
    arrayDeque.addLast("a");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();
    arrayDeque.peekFirst();
    arrayDeque.peekLast(); // 快過Linkedlist的
    arrayDeque.remove();

    Deque<String> linkedDeque = new LinkedList<>(); // linked list
    linkedDeque.addFirst("a");
    linkedDeque.addLast("a");
    linkedDeque.pollFirst();
    linkedDeque.pollLast();
    linkedDeque.peek();

    Queue<String> arrayQueue = new ArrayDeque<>(); // array
    arrayQueue.add("a");
    arrayQueue.poll();
    arrayQueue.peek();
    Queue<String> linkedQueue = new LinkedList<>(); // linked list
    linkedQueue.add("a");
    linkedQueue.poll();
    linkedQueue.remove();

    Queue<String> pQueue = new PriorityQueue<>(); // 背後是 array
    pQueue.add("a");
    pQueue.poll();
    // PriorityQueue好慢，sorting

    List<Integer> arraylist = new ArrayList<>(); //array
    arraylist.add(3);
    arraylist.remove(3); // removed by index
    List<Integer> linkedList = new LinkedList<>(); // linked list
    //linkedList,poll(); <無pool的 因為用左List
    linkedList.add(3); 
    linkedList.remove(3); //  removed by index
    //右手邊決定.methods有咩z > how to do，點用呢DMethod
    //左手邊決定 有咩method?what can i do

    List<String> stack = new Stack<>();//
    stack.add("abc");
    stack.remove(0);

    Vector<String> stack2 = new Stack<>(); // Vector vs List
    stack2.add("abc");
    stack2.remove(0);

    Stack<String> stack3 = new Stack<>();
    stack3.push("abc");
    stack3.pop();

    String s = "abc";
    char[]arr1 = s.toCharArray();
  }
}
