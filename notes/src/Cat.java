public class Cat {

 String name;
  private String color;
  private int age;
  private double weight;

  // Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public Cat() {

  }

  public Cat(String name, String color) {
    this.name = name;
    this.color = color;
  }
  public static void main(String[] args) {
    Cat cat1;
    cat1 = new Cat();
  }
}
