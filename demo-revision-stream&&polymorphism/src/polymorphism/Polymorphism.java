package polymorphism;
public class Polymorphism {
  
  public static void main(String[] args) {
    //static polymorphism (overloading)
    // get(int x) is different to get(String x)
    // compile-time check

    //dynamic polymorphism (Parent class,Interface)
    //Customer extends Human implements Orderable

    // implementation =右邊// Customer, Human, Driver 都implements order() (Override)
    Human customer = new Customer("John");
    customer.order(); // new Customer ( Customer order:++)
    System.out.println(Customer.counter);// 1

    Customer customer2 = new Customer("Peter");
    customer2.order();
    System.out.println(Customer.counter);// 2 (+1)

    Human human = new Human("Mary");
    human.order(); // new Human ( Human order:+=2)
    System.out.println(Customer.counter); // 4(+2)
    // Customer human = new Human(); // Cannot asssign Parent class to child

    customer2.humanOrder(); // Customer:super.order() human's order > +=2
    System.out.println(Customer.counter);//6 (+2)

    //Interface
    Orderable customer3 = new Customer("Eric");
    customer3.order();//7(+1) // new Customer>用咩容器裝唔緊要，右邊先係implementation
    System.out.println(Customer.counter);

    Orderable[] orders // 2個class都有implements個orderable
    = new Orderable[]{new Customer("Peter"),new Driver()};

    //polymorphism
    Orderable order = getByName(orders, "Peter"); // CUSTOMER入面有PETER搵到 --> Customer
    order.order(); //+1(8) // return customer
    System.out.println(Customer.counter);//8

    Orderable order2 = getByName(orders, "Vincent"); //CUSTOMER搵唔到vincent>Return Driver
    order2.order(); // +3
    System.out.println(Customer.counter);//11
  }

  
  public static Orderable getByName(Orderable[] orders,String name){
    for(Orderable order: orders){
      if(order instanceof Customer){
        Customer customer =  (Customer) order; // virtual object>downcast
        if(name.equals(customer.getName())) //return name
        return customer;
      }
    }
    return new Driver();
  }
}
