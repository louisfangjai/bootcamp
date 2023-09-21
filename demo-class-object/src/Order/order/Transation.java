package order;

public class Transation {
/////////////////////////////feater///////////////////
  private int itemNo;
  private ItemDesc itemDesc;
  private int quantity;
  private double unitPrice;
  // private Discount discount;
  //private double discount;//raw data

  ////////////////////////////constructors///////////////
  public Transation(int itemNo, ItemDesc itemDesc, int quantity,
      double unitPrice) {
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  ///// subtotal  EACH itemNO -----unitPrice X quantity//////
  //getSubtotal(), no new attribute


////////////////////////getter//////////////////////
  public int getItemNo() {
    return this.itemNo;
  }

  public ItemDesc getItemDesc() {
    return this.itemDesc;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

/////////////////////////setter////////////////////////////////////
  public void setItemNo(int itemNo) {
    this.itemNo = itemNo;
  }

  public void setItemDesc(ItemDesc itemDesc) {
    this.itemDesc = itemDesc;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice(double unitprice) {
    this.unitPrice = unitprice;
  }

  //////////////////////////subtotal/////////////////
public double subtotal() {
  return this.quantity*this.unitPrice;
}

////////////////////////total///////////////////
 


}