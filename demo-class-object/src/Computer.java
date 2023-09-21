public class Computer { // computer是個task, 是Public class 第二度都可以new computer
  // attributes
  private int ram;
  private int weight;
  private String color; // private係呢個file先改到

  // Constructors (左邊無return type)名=CLASS, 用黎new object,唔寫代表有empty constructor，刻意寫constructors 便會無左empty constructors
  public Computer() {

  }

  public Computer(String color) { // (1) No return type, (2) Constructor name = Class name
    this.color = color;
  }

  public Computer(int ram, int weight, String color) { // (1) No return type, (2) Constructor name = Class name
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  // method
  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
