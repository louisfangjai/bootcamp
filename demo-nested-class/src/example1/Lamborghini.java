package example1;

public class Lamborghini {

  private String model;
  private Color color;
  private int sellingPrice;
  private String rank;

  public Lamborghini(Builder builder) {

    this.model = builder.model;
    this.color = builder.color;
    this.sellingPrice = builder.sellingPrice;
    this.rank = builder.rank;
  }
  public static Builder builder(){ // Return Builder
    return new Builder();
  }

  @Override
  public String toString() {
    return "[model = " + this.model + ", Color = " + this.color
        + ", sellingPrice =" + this.sellingPrice + ",rank =" + this.rank;
  }

  /////////////////////////////////////////////
  public static class Builder {
    private String model;
    private Color color;
    private int sellingPrice;
    private String rank;

    public Builder setModel(String model) {
      this.model = model;
      return this;
    }

    public Builder setColor(Color color) {
      this.color = color;
      return this;

    }

    public Builder setSellingPrice(int sellingPrice) {
      this.sellingPrice = sellingPrice;
      return this;
    }

    public Builder setRank(String rank) {
      this.rank = rank;
      return this;
    }

    public Lamborghini build() {
      return new Lamborghini(this);
    }
  }


  public static void main(String[] args) {
    Lamborghini l1 = new Lamborghini.Builder().setColor(Color.YELLOW).build();

    Lamborghini l2 = new Lamborghini.Builder().setColor(Color.BLACK)
        .setRank("A").setModel("ABC").setSellingPrice(200).build();

    Lamborghini l3 = new Lamborghini.Builder().setModel("ABC").setRank("A")
        .setSellingPrice(150).setColor(Color.BLACK).build();

    System.out.println(l3.toString());
  }
}
