import java.math.BigDecimal;

public class Person2 {

  private int age;
  private String name;
  private double height;
  private double weight;
  private double BMI;

  public Person2() {

  }

  public Person2(int age, String name, double height, double weight) {
    this.age = age;
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double calculateBMI() {
    double a = this.weight / (this.height * this.height);
    setBMI(a);
    return this.BMI;

  }

  public void setBMI(double BMI) {
    this.BMI = BMI;
  }

  public double calculateBMI2() {
    BigDecimal bw = BigDecimal.valueOf(this.weight);// 80
    BigDecimal bh = BigDecimal.valueOf(this.height);// 1.7
    BigDecimal result = bh.multiply(bh);
    result = bw.divide(result, 1);// 80/ (1.7*1.7)
    // System.out.println(result.doubleValue());
    setBMI(result.doubleValue());
    return result.doubleValue();


  }

  public String getCategory() {
    if (this.BMI < 18.5) {
      return "underweight";
    } else if (this.BMI >= 18.5 && this.BMI <= 24.9) {
      return "normal weight";
    } else if (this.BMI > 24.9 && this.BMI <= 29.9) {
      return "overweight";
    }
    return "obese";
  }

  public static void main(String[] args) {
    Person2 p2 = new Person2(20, "陳大文", 1.7, 80);

    // p2.setBMI(p2.calculateBMI());
    System.out.println(p2.calculateBMI2());
    System.out.println(p2.getCategory());
  }
}
