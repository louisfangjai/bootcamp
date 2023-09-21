import java.util.Arrays;

public class Arrr {
  
  public static void main (String[] args){
      boolean [] b1 = new boolean[] {false,true};
      //boolean [] b2 = new boolean[] {false,true};
      String s1 =Arrays.toString(b1);
      String s2 =Arrays.toString(b1);
      System.out.println(s1);
      System.out.println(s1==s2); //false
      String [] strings1 = new String []{"hello","hello"};
      String  s3 = Arrays.toString(strings1);
      String  s4 = Arrays.toString(strings1);
      System.out.println(s3==s4);//false

  }
}
