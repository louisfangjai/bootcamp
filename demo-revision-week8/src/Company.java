import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Company {
  
  List<Staff> staffs;
  List<List<Staff>> staffLists;
  int[][] arr = new int[2][3];
  private static int counter;

  public Company(){
    staffs = new ArrayList<>();
  }

  public Company(List<Staff> staffs){
    this.staffs=staffs;
  }

  public List<Staff> geStaffs(){
    return this.staffs;
  }

  public void add(Staff staff){
    this.staffs.add(staff);
    //counter++;
  }
   // 打/** 
  /**
   *  Get Staff name by staff id
   * @param staffId
   * @return
   */
  public Optional<String> getStaffName(int staffId){ // incident
    return this.staffs.stream() //  一係collection就可以dot stream
      .filter(s->s.getId() == staffId) // List<staff>
      .map(s -> s.getName()) // Convert List<Staff> to list<String>
      .findAny(); // Optional<String> ,出Optional return type
     //.orElse(null); //String <多傑
 } 
  public static void main(String[] args) {
      Company company = new Company();
      company.geStaffs().add(new Staff(1,20000,"John")); // OK
      company.add(new Staff(2, 10000, "Peter"));

      company.getStaffName(1); // "John"

      Company company2 = new Company();
      company2.geStaffs().add(new Staff(3,4444,"ANGUS"));
      
    }
  
}
