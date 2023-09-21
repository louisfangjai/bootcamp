package shape;

public class demoshape {
  
  public static void main(String[] args){ //用家唔洗諗點樣new edge
    Square s1 = Square.of(5.0d);
    Square s2 = Square.of(4.5d);
    Square s3 = Square.of("5");

 // s1 -edges array> arr[0](一個edge的object) > setcolor]> edges[0] color -> YELLOW
    s1.getEdge(0).setColor("YELLOW");
    System.out.println(s1.getEdge(0).getColor());

    // getEdges() has 4 address, getEdges()[0]-> 1 address
    //s1.getEdges() =

  }
}
