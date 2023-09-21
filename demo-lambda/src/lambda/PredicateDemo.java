package lambda;


import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  
  public static void main(String[] args) throws Exception{
    //developer 工作
    Predicate<Character> isMale= c-> c=='M'; // c是T 代表住個入口i.e Character
    Predicate<String> isUpperCase = s ->{
      for(int i=0; i< s.length();i++){
        if(s.charAt(i)< 65 || s.charAt(i) > 90) // ascii 65:A,90:Z
        return false;
      }
      return true;
    };
    // tester(寫test case)
    test(isMale, 'F', false); // 第三個expected value
    test(isMale, 'M',true);//
    test(isUpperCase,"ABCaD",false);
    test(isUpperCase, "ABCDD", true);
    //test(isUpperCase, null, false);
    //test(isUpperCase, "", true);
    
    System.out.println(isMale.test('F'));//false

    //BiPredicate
    BiPredicate<String,String> equals = 
    (s1,s2)-> s1 != null && s1.equals(s2);
    //可能性
    test(equals,"abc","abc",true); // static method
    PredicateDemo.test(equals,"abc","bcd",false);
    test(equals,"abc",null,false);
    test(equals,null,"bcd",false);
    test(equals,null,null,false);
    test(equals,"",null,false);
    test(equals,"","",true);

    Predicate<LocalDate> isCoolingOff =
    effdate-> effdate.plusMonths(3).isAfter(LocalDate.now());
    
    test(isCoolingOff,LocalDate.of(2023,7,17),true);
    test(isCoolingOff,LocalDate.of(2023,7,18),true);
    
  }

  public static <T> void test(Predicate<T> testcase, T data, 
    boolean expectedResult) throws Exception{
        if(testcase.test (data) == expectedResult)
        return;
        throw new Exception(); 
      
  }

  public static <T,U> void test(BiPredicate<T,U> testcase, T data, U data2,
    boolean expectedResult) throws Exception{
        if(testcase.test (data,data2) == expectedResult) // 這個test是佢的test
        return;
        throw new Exception(); 
      
  }
}
