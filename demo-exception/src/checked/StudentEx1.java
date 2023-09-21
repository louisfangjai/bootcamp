package checked;

public class StudentEx1 {
  String name;
  long pocketMoney;

  public StudentEx1(){

  }

  public StudentEx1(String name){
    this.name = name;
  }

  public void setName(String name) throws NameTooLongException{ //check exception // throws比caller
    if(name.length()>10)
    throw new NameTooLongException("Name is too long (>50)");
    this.name=name;
  }

   public void setPocketMoney(long pocketMoney) throws AmountZeroException{ //check exception // throws比caller
    if(pocketMoney<=0)
    throw new AmountZeroException("Amount<=0");
    this.pocketMoney=pocketMoney;
  }

  public static void main(String[] args)throws Exception {
    StudentEx1 student1 = new StudentEx1();
    try{
        student1.setName("OSCARRRRRRRRRRRR");
        //student1.setPocketMoney(3);
    }catch(NameTooLongException e){
      System.out.println(e.getMessage());
    }



  }
}
