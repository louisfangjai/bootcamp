package checked;

public class Student {
  String name;
  long pocketMoney;

  public Student(){

  }

  public Student(String name){
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
  // handle checked exceptions >1.throws比人，2.自己handle

public static void main(String[] argst)throws Exception{ // 上面寫throws是因為
  Student student = new Student("John");
  try{ // 主logic好小PRINT野，正如leetCode你一print野就好慢, 10ms好多, for loop都係0,1ms
    //checked exception
    //int i =10/0;
    student.setName("ds");
    student.setPocketMoney(-3); // 一中槍就要走，if 上面中左就唔會行
  } catch (NameTooLongException | AmountZeroException e ){ // catch左上面唔會落下面，else-if concept, throw object catch object
    System.out.println("Student setter issue, message:"+e.getMessage()); // getMessage method  from throwable message:[Name is too long(>50)，Amount<=0]
    //System.out.println("Name Too Long > 10");
  }  catch (RuntimeException e){ //寫左幫你定位 無fix到
    //} catch (Exception e){ // catch到除0..null pointer,咩都捉曬，兜底>> 但捉到!=solve到， 兜底>搞到D人 唔fix個問題，所以盡可能唔寫兜底
      System.out.println(e.getMessage()); // / by zero
    }
    finally{ //最尾都會到呢一步，一定會行
      System.out.println("finally");
    }
    
    student.setName("ds"); // if meet exception, throw it to the caller
  Student student2 = new Student();
  //student2.name.length();// null pointer , unchecked exception, complie time check唔到null pointer
  }
}
//RuntimeException 唔會幫你catch，佢只是幫你鎖定位置，解決唔到個問題
// Method> 唔會快左，但try catch，
//自己寫A,B,C method，人地call你A
// 做 1 D不可控的野，唔係catch自己program, what if 唔做try catch
// 人地call你，邊個call你有事
// check exception> deque send email send sms, inventory,
//交易sysytem C++夠快，java: ebanking hr system
//java 無mgt memory上的野戰