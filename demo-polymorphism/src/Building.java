public abstract class Building { // abstract class or class (parent)

  double height;

  public void print() {
    System.out.println("I am Building");
  }

  public void print2() {
    this.print(); // 個this 唔係講緊building 講緊house， this係講緊果個時空下行緊的object
    // 因為building個address 指去new house，即係 this.print()=house.print()
    // house.print本身係override緊 building 的print。
  }

  public void print3() {
    System.out.println("I am Building");
  }
  
}
