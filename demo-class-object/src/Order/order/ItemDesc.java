package order;

public class ItemDesc {

  ////////////////////////features////////////////////////
  private String header;
  private String body;

  /////////////////////////constructors////////////////////////////
  public ItemDesc(String header, String body) {
    this.header = header;
    this.body = body;
  }

  public static void main(String[] args) {
    ItemDesc itemDesc1 = new ItemDesc("ItemA","90% Discount, just for today!");
    ItemDesc itemDesc2 = new ItemDesc("ItemB", "70% Discount, just for this week!");

    Transation t = new Transation(1, itemDesc1, 3, 10.5); //(int itemNo, ItemDesc itemDesc, int quantity,double unitPrice)
    Transation t2 = new Transation(2, itemDesc2, 4, 20.5);

    Transation[]arr=new Transation[]{t,t2};
    Order order = new Order(new Transation[] { t, t2 });// new Order(arr);

    //////////////////subtotal////////////////////
   System.out.println(t.subtotal());
   System.out.println(t2.subtotal());


    ////////////////total//////////////////
    System.out.println(order.getTotal()); // 3*10.5+ 4*20.5

  }
}