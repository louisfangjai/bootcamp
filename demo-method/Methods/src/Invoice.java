import java.util.Arrays;

public class Invoice {
  // Task 1: A method to calculate item total prices
  public static double calcTotalItemPrices(double quantity, double unitPrice) {
    //Early Return
    // Parameters Control
    if(quantity < 0 || unitPrice < 0){
      return 0;
     }
       return quantity * unitPrice; // 5*10.9 // ,ain logic
    }
  // Task 2: A method to calcuate total amount of the invoices
  public static double calcTotalAmount(double[] totalItemPrices) {
    double total = 0.0;
    for (int i = 0; i < totalItemPrices.length; i++) {
      total += totalItemPrices[i];
     // total = total + totalItemPrices[i];
    }
    return total; // 不一定最後，可以多過一個return
  }
  public static void main(String[] args) {
    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 100.3};
    double[] totalItemPrices = new double[quantities.length]; // [54.5,...]
    System.out.println(totalItemPrices);
    System.out.println(Arrays.toString(totalItemPrices));
    System.out.println("totalitemprices.length = " + totalItemPrices.length);

    for (int i = 0; i < totalItemPrices.length; ++i) {

      totalItemPrices[i] = calcTotalItemPrices(quantities[i], unitPrices[i]);
      System.out.println(
          "i= " + i + " ,totalItemPrices[" + i + "]= " + totalItemPrices[i]);

    }
    System.out.println(totalItemPrices);
    System.out.println(Arrays.toString(totalItemPrices));

    double invoiceTotalAmount = calcTotalAmount(totalItemPrices);//this is array
    System.out.println("Invoice Total Amount= " + invoiceTotalAmount);

  }
}
// double[] totalItemPrices = new double[]{54.5,1003.0,8.4d,63.0,2006.0};

// calTotalItemPrices(i, j)
// double [] totalPriceItems = .....; 5*10.9
// Loop
// double invoiceTotalAmount = ;

