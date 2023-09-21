package stack1;

import java.util.Stack;

public class DemoStack { //stack是好慢的> Deque
  
  public static void main(String[] args) {
    // **First in Last Out **
    Stack<String> stack1 = new Stack<>();
    stack1.push("abc");
    stack1.push("def");
    System.out.println(stack1.pop()); //def 黎緊出黎果個

    stack1.push("xyz");
    stack1.push("abc");
    while(!stack1.isEmpty()){
      System.out.println(stack1.pop()); // abc2,xyz,abc
    }
    // stack
    stack1.add("ijk"); // same as push
    stack1.push("fgi");
    stack1.add("ijk");
    System.out.println(stack1.pop());//ijk

  }
}
