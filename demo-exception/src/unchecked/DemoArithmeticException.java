package unchecked;
public class DemoArithmeticException {
  
  public static void main(String[] args) {
    int i =0;
    int n =100;
    int result =0;
    try{
       result = n/i; //想test
    } catch (ArithmeticException e){ // try to catch 指定的Exception
      result =0;
    }
    System.out.println("Result="+result);
  }
}

// run time 有機會除0
