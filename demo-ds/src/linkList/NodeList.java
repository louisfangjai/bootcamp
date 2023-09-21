package linkList;

public class NodeList {
  
  Node head;

  public NodeList(Node head){
    this.head=head;
  }

  public void add(Node node){
    this.head.next=node;
  }

  public void addFirst(Node node){

  }

  public void insert( int index, Node node){
    
  }
  public void remove(Node node){

  }
  public static void main(String[] args) {
    NodeList list = new NodeList(new Node(10));
    list.add(new Node(100));
    list.add(new Node(200));//

  }
}
