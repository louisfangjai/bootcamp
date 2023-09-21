public class Car {
  // Instance Variables (Instance -> Object)
  // member vaiables
  private int noOfwheel; // default value -> 0
  private int capacity; // 0
  private String color; // null
  // 只是set左3種訊息

  // Empty Constructor, public出面的人都可以new個car
  public Car() {

  }

  // All-arguments constructor ( with All attributes) con
  public Car(int noOfwheel, int capacity, String color) {
    this.noOfwheel = noOfwheel;
    this.capacity = capacity;
    this.color = color;
  }

  public void setNoOfWheel(int noOfwheel) {
    this.noOfwheel = noOfwheel;
  }

  public int getNoOfWheel() {
    return this.noOfwheel;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }


}

