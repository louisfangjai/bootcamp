package unchecked;
public class DemoStringIndex {
  
  public static void main(String[] args) {
    try{
      "ac".charAt(3);
    } catch(StringIndexOutOfBoundsException e){
      System.out.println("String index issue"); // 開會經過
    }

    System.out.println("aac".charAt(2));
  }
}
