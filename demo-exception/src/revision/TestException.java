package revision;
public class TestException {

  public static int method(int amount)throws BusinessException{
    if(amount>=0) // 唔建議寫else
    return amount*100;
    throw new BusinessException("amount<0");
  }
  public static int method2(int amount) throws AbcException{ //Abc是runtime
     if(amount>=0) // 唔建議寫else
    return amount*100;
    throw new AbcException();
  }
  //Approach 2 : throws the BusinessException in method signature
  //可以兩邊做曬但唔需要咁做
  public static void main(String[] args)throws BusinessException { 
    // checked exception要handle，unchecked 唔洗handle
    //Exception// checked exception
    //RuntimeException// unchecked exception

    //Exception// checked exception
    //Approach 1 : handles by try&catch
    try{
    int result = method(-2); // Once hit error, cannot proceed the rest of the codes
    //skip the rest of the codes
  } catch(BusinessException e){ // 不可以and，可以or
    System.out.println(e.getMessage()); //amount<0
  } catch(Exception e){ // handle曬，好少咁寫，要逼個programmer去handle佢
    System.out.println(e.getMessage()); //amount<0
  }finally{ //點都要execute
    System.out.println("final code block");
  }

   //RuntimeException// unchecked exception
   int a = 10;
   if(a>= 0){
    int result2 = method2(a);// Don't need to handle Runtime exception
   }
    }
    // throw exception比對方等佢知發生咩事
}