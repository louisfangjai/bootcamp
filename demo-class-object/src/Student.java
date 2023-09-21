public class Student {
  //State / Instance Variable
  private String firstName;
  private  String lastName;
  private int age;
  
  //All-arguments constructor ->  new object(instance)
  public Student (String firstName,String lastName, int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
  }
  public String fullName(){
    return this.firstName.concat(" ").concat(this.lastName);
  }
  public boolean isAdult(){ //你唔一定要成個age比人, 用緊個波的age
    // if(this.age >= 18)
    //     return true;
    // return false;
    // return this.age>= 18? true: false;
    return this.age >= 18; //得2種可能性 >=18>true, <18 false
  }
  public static boolean isAdult(int age){ //保護個波數據,你放資料入面 同個class無關係，放係carfactor classs都得
    return age>=18;
  }
  // Behaviors/ Methods
  public String getFirstName(){
      return this.firstName;
  }
  public String getLastName(){
      return this.lastName;
  }
  public int getAge(){
    return this.age;
  }
  public void setFirstname(String firstName){
    this.firstName = firstName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public void setAge(int age){
    this.age=age;
  }
}
