package linkList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
  
  String str;
  LinkedList1 node;//下一個地址

  public LinkedList1(){

  }

  public LinkedList1(String str){
    this.str=str;
  }
  public void setStr(String str){
    this.str=str;
  }

  public void setNode(LinkedList1 node){
    this.node=node;
  }
  public String getStr(){
    return this.str;
  }
  public LinkedList1 getNode(){
    return this.node;
  }
  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.setStr("head");
    ll.setNode(new LinkedList1("body"));
    ll.getNode().setNode(new LinkedList1("tail"));
    System.out.println(ll.toString());

    LinkedList1 head =ll;
    String string = "";

    while(head.getNode()!=null){
      string+= head.getStr(); 
      head= head.getNode();// object reference 蛇頭吞落去蛇身
    }
      //LinkedList, ArrayList個add 同Linkedlist add是唔同
      //ArrayList再加 要重新起過條Array, read得多用ArrayList (for read)
      //LinkedList是加得多用(唔洗重新起，只是很多東在memory上散落，唔會斬左佢)
      ArrayList<String> l2 = new ArrayList<>(); //好工整咁樣abc 相鄰
      l2.add("abc");
      l2.add("abc");
      l2.add("abc");

      LinkedList<String> l3 = new LinkedList<>(); // implements兩張contract
      l3.add("abc");
      l3.add("abc");
      l3.add("abc");

      // ArrayList 同 LinkedList ge add是不同19
      List<String> String = new ArrayList<>(); // poly, Interface
      // if(time = 6pm){

      // }
      // string.add(); //個 add method唔同Object有唔同override
      // .remove()
  }
}
