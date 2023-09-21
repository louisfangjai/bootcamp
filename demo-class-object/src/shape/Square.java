package shape;

public class Square {
  
  private Edge[] edges; // instance variable (最好加s表達眾數)，每個波都有edge的array
  // final左個Edge[] 地址，唔可以再改
  //private static int edgeCounter;

  ////////////////////////////////////////////////////

  // public Square(){ //constructor
  //   this.edges = new Edge[4];// [null,null,null,null] -> 一 new squuare就有4條邊
  //   this.edges[0] = new Edge(3.0d,"RED");
  //   this.edges[1] = new Edge(3.0d,"YELLOW");
  //   this.edges[2] = new Edge(3.0d,"BLACK");
  //   this.edges[3] = new Edge(3.0d,"BLUE");
  // }
    

   
    private Square(double length){ //constructor, length是parameter, private constructor
      if(length<=0.0)
          length=1.0d; //防守性
          int id = 0;
    this.edges = new Edge[4];// [null,null,null,null] -> 一 new squuare就有4條邊，一有new就係有新object
    this.edges[0] = new Edge(++id,length,"RED");
    this.edges[1] = new Edge(++id,length,"RED");
    this.edges[2] = new Edge(++id,length,"RED");
    this.edges[3] = new Edge(++id,length,"RED"); //用家只係想入長度出square，條edge無理由 由user去決定
    // 5 個new 5個 address
    // Square.resetId() // 用個class去reset Id
  }

  public static Square of(double length){
    return new Square(length);
  }
  public static Square of(String length){
    return new Square(Double.valueOf(length));
  }
  public Edge getEdge(int edgeId){
    return this.edges[edgeId-1];// 1234-0位 //return其中一個條邊
  }
  public void setEdges(Edge[] edges){ // 用家角度唔關心 Edge array
    this.edges=edges; //紅線: final左唔可以被修改，除左constructor
  }
  
  public void modify(double length){
    this.getEdges()[0].setLength(length);
    this.getEdges()[1].setLength(length);
    this.getEdges()[2].setLength(length);
    this.getEdges()[3].setLength(length);
  }

  public void modify(String color){
    this.getEdges()[0].setColor(color);
    this.getEdges()[1].setColor(color);
    this.getEdges()[2].setColor(color);
    this.getEdges()[3].setColor(color);
  }

  public void modify(int edgeId,String color){
    this.getEdges()[edgeId].setColor(color);
  }

  private Edge[] getEdges(){ // return array object //private唔洗用家掂
    return this.edges; //出面拎唔到array
  }
  public static void main(String[] args){ //用家唔洗諗點樣new edge
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);

 // s1 -edges array> arr[0](一個edge的object) > setcolor]> edges[0] color -> YELLOW
    s1.getEdges()[0].setColor("YELLOW");
    System.out.println(s1.getEdges()[0].getColor());

    //s1.setEdges(s2.edges);// 將S2個array放入左S1

    // getEdges() has 4 address, getEdges()[0]-> 1 address
    //s1.getEdges() =

  }

}
