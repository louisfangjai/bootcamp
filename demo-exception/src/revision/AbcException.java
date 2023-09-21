package revision;
public class AbcException extends RuntimeException{ // 意味著 Abc係runtime
  // by Zero
  // null pointer
  // array size(outbound)
  // cconcurrentModification >不可以做一個動作base on固定size
  //上面4個要fix 佢 >唔應該catch佢 > 係要唔應該中佢
  // suppose無野要extends RuntimeException
  // RuntimeException是無得補救

  public AbcException(){
    super("abc exception");
  }

  public static void main(String[] args) {
    int a =10/0;
    //System.out.println(a);
  }
}
