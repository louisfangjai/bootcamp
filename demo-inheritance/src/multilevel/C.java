package multilevel;
import java.util.Arrays;

public class C extends B { // 繼承曬A同B，唔寫你搬返落黎，其實都做到
  
public void print(int[]arr){
System.out.println(Arrays.toString(arr));
}
  public static void main(String[] args) {
    C c = new C();
    c.num=10; //無private先可以咁set
    c.str="hello";
    c.setNum(100);
    c.setStr("abc");

    c.print(5);//100 5 (from A)
    c.print("def");//abc def (from B)
    c.print(new int[]{-1,0,2}); //[-1,0,2]
    //就算method名一樣 佢有3個Print
  }
}
