public class Number2 {
  int number1;
  int number2;

  public void setNumber1(int number1) {
    this.number1 = number1;
  }
  public void setNUmber2(int number2) {
    this.number2 = number2;
  }
  public int divide() { // non-static method
    this.print(); // non-static method call non-static method, 自己野call自己野 print左
    System.out.println(Number2.add(this.number1, this.number2)); // n1 -> 13+26 39
    return this.number2 / this.number1; //26/13=2
  }

  public static int divide(int number1, int number2) { // static
    //Number2 a = new Number2(); // 係入面new
    //a.setNumber1(123);
    //a.setNUmber2(1000);
    //a.print();
    return number2 / number1;
  }
   public static int add(int number1, int number2) {
    return number1 + number2;
  }
  public void print() {
    System.out.println("this.number1=" + this.number1); //13
    System.out.println("this.number2=" + this.number2); //26
  }

  public static void main(String[] args) {
    Number2 n1 = new Number2();
    n1.setNumber1(13);
    n1.setNUmber2(26);
    Number2 n2 = new Number2();
    n2.setNumber1(10);
    n2.setNUmber2(100);
    System.out.println("start");
    System.out.println("n1.divide() = "+n1.divide()); // 26/13 = 2
    System.out.println("n2.divide() = "+n2.divide());// 100/10= 10

    System.out.println("static Method divide = "+Number2.divide(3, 6)); // 6/3=2 , n1 -> 13,26
    n1.print();
    n2.print();

  }
}
