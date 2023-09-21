import java.time.LocalDate;

public class Person {
  String name;
  int age;
  int height;
  int weight;
  int money;

  public Person(){

  }

  public Person(String name, int age, int height, int weight){

    this.name=name;
    this.age=age;
    this.height=height;
    this.weight=weight;
  }

 public Person(String name, int age, int height, int weight,int money){
  this(name, age, height, weight);
  this.money=money;
 }

 public int getMoney(){
  return this.money;
 }

 public int getWeight(){
  return this.weight;
 }
 public static void main(String[] args) {
  Person p1 = new Person("Sunny", 20, 30, 40);
  Person p2 = new Person("HIM",30,50,20,88);
  System.out.println(p2.getMoney());
  System.out.println(p2.getWeight());
 }
}
