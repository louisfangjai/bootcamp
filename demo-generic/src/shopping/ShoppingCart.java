package shopping;
import java.util.ArrayList;
import javax.swing.Box;

public class ShoppingCart {
  
  private ArrayList<CheckoutItem> items; //CheckoutItem 已分到好細，唔洗 <T>

  public ShoppingCart(){
    items=new ArrayList<>();
  }
  public int totalAmount(){
    int sum=0;
    for(CheckoutItem item : this.items){
      sum+= Math.max(0,item.getPrice())* Math.max(0,item.getQuantity());
    }
    return sum;
  }
  public void add(int quantity, DisplayItem DisplayItem){ // instant method 唔好比range// T food> Food food(因為唔確定)
    //items.add(item);
    // *construct CheckoutItem;
    CheckoutItem checkoutItem =
    new CheckoutItem(quantity,DisplayItem.getPrice());
    items.add(checkoutItem);
  }

  public boolean remove(CheckoutItem item){
    return items.remove(item);
  }

  public void clear(){
    this.items.clear();
  }
  public static void main(String[] args) {
    ShoppingCart cart1 = new ShoppingCart(); //用緊唔可以寫T，要寫死
    //cart1.add(new Food); // Food is abstract
    // cart1.add(new Rice());
    // ShoppingCart<Drink> cart2 = new ShoppingCart<>();
    // ShoppingCart<Food> cart3 = new ShoppingCart<>();
    // ShoppingCart<Rice> cart4 = new ShoppingCart<>();
    //ShoppingCart<Object> cart5 = new ShoppingCart<>(); extends緊Item

    
  }


}
