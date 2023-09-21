public class Testexp extends RuntimeException {
  
  public Testexp(){

  }

    public Testexp(String msg, Throwable e){
      super(msg,e);
  }
  public static int test() throws Testexp{
    throw new Testexp();
  }
  public static void main(String[] args) {
    test();
  }
}

