package Quiz;

public class Password implements S1 {

  private String password;

   Password(String x){
    this.password=x;
  }
  @Override
  public String show(){
    System.out.print("abc");
    return this.password;
  }
  public static void main(String[] args) {
    Password p1=new Password("SS");
    p1.show();
    System.out.println(p1.show());

    String s1="abc";
    String s2="abc";
    System.out.println(s1==s2);
  }
}
