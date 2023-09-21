import java.util.Arrays;

public class Array3 {

  public static void addOne(int[] arr) { // arr-> object referencee 等如左手面就係object reference, address // Pass by reference
    // int[] res = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    } // return res; see addOne2
  }

  public static int[] addOne2(int[] arr) {
    int[] res = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      res[i] = arr[i] + 1;
    }
    return res;
  }
  // All Wrapper Class + String -> Pass by Value
  public static String concat(String s1, String s2) { // pass by value,所有wrapper class都係pass by value
    s1 = "hello";
    return s1 + s2;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8}; // delcare個波去nums個地址
    addOne(nums); // -> 4,5,9
    System.out.println("reference only  "+Arrays.toString(nums)); // [4,5,9] //call method時，比nums 個地址

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]); //4,5,9
    }
    // Call concat
    String a = "abc";
    String b = "def";
    String result = concat(a, b); // result=hellodef，將 a的copy拎入去reassign左做hello但無影響本身個a
    System.out.println("The result is "+concat(a, b)); // 所以a=abc,b=def
    System.out.println("a is   "+a); //abc
    System.out.println("b is   "+b);//def

  }
}
