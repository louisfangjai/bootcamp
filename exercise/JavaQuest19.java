
/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
  private int year;
  private String carModel;
  // Constructor with variables carYear and carModel
 public JavaQuest19(int year, String carModel){
  this.year=year;
  this.carModel=carModel;
 }
 public void setYear(int year){
  this.year=year;
 }
 public void setCarModel(String carModel){
this.carModel=carModel;
 }
 public int getYear(){
  return this.year;
 }
 public String getCarmodel(){
  return this.carModel;
 }
  
 // methods


  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    // Create an instance of thefclass, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    System.out.println(myCar.getYear()+"  "+ myCar.getCarmodel());
  }
}