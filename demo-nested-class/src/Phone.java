// Builder Pattern Demo
public class Phone {
  private String number;
  private Color color;
  private double weight;

  private Phone(Builder builder){
    this.number=builder.number;
    this.color=builder.color;
    this.weight=builder.weight;
  }

  public static Builder builder(){ // Return Builder
    return new Builder();
  }

  @Override
  public String toString(){
    return "[number="+this.number//
    +",color="+this.color//
    +",weight="+this.weight//
    +"]";
  }
  public static class Builder{ // private class，因為上面借左method
    // With same attributes of outer class
  private String number;
  private Color color;
  private double weight;

  public Builder number(String number){//setter
    this.number= number;
    return this;
  }
  public Builder color(Color color){//setter
    this.color= color;
    return this;
  }
  public Builder weight(double weight){//setter
    this.weight= weight;
    return this;
  }
  public Phone build(){
    return new Phone(this);
  }
  }

  public static void main(String[] args) {

    //Chain Method: replace different number of args constructors,好過arguments constructor
    Phone phone = new Phone.Builder()//
    .color(Color.BLACK)// < 若唔寫就 color=null
    .number("1234567")//
    .weight(3.7d)//
    .build();
    //builder pattern
    // Phone phone2 = new Phone();
    

    System.out.println(phone);

    Phone phone2 = Phone.builder().build(); // empty
  }
}
