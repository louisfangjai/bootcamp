package order;

public class Order {
//////////////////////////features/////////////////////////////
  private Transation[] transactions; //1 個order有好多transaction

////////////////////////////constructors////////////////////////
  public Order(Transation[] transations){ // transations是items
    //Pass by reference
    this.transactions = transations;
  }

//////////////////////////////total//////////////////////
//getTotal()-> sum up subtotal
public double getTotal(){ //唔洗比野，因為order呢個指住曬D transations
  double total =0; // 其實只係temp
  for(int i =0; i<this.transactions.length;i++){ // 果個transaction的length
    // System.out.println(transactions[i].subtotal()); TEST
    total += this.transactions[i].subtotal(); // transactions[i] -> ? Array入面拎個波出黎，object 個波上面可以.野
  }          // Object.method
  return total;
}






}
