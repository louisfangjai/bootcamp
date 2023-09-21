interface Reading{
  void read();
}

public class AnnoymousExample {
  
  public static void main(String[] args) {
    //lambda (method1)
    Reading read1 =()->{
      System.out.println("I am Lambda, reading....");
    };
    read1.read();

    //method2
    Reading read2 = new Reading() {
      int x; // instance variable

      @Override
      public void read(){
        this.x++;
        System.out.println("I am Annoymous,reading...x="+x);
      }
    };
    read2.read();
    read2.read();
  }
} // Both method can present similar function,however, there is a difference when you
//decide to set instance varaible...... methods...
