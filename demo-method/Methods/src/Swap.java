import java.util.Arrays;

public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -400, 3, 99};
    // code here... to swap 100 and 99
    int temp = arr[0]; // back up
    arr[0] = arr[arr.length - 1];
    arr[arr.length - 1] = temp;

    // print all elements
    for (int i = 0; i < arr.length; i++) {
      // code here
      System.out.println("arr[" + i + "]=" + arr[i]);
      // [romt]
    }
      System.out.println(Arrays.toString(arr)); // 可用String.valueOf?

    String test1 = "abcd";
    System.out.println("arrays.tostring  "+ SwapOddEvenCharacter(test1));
    "123".isEmpty(); //varablie
    System.out.println("123isEmpty".isEmpty()); //->false，括號入面 static method
    System.out.println("S.valueOf = "+S2(test1));
   ;
     String str1 = String.valueOf(123); // "123"
     System.out.println("str1 = "+str1);
     String str2 = String.valueOf("ss"); // "true"
     System.out.println("str2 = "+str2);
  }
  
  // Swap
  public static String SwapOddEvenCharacter(String str) {
    // hello! -> ehll!o
    // abcd ->badc
    // aabb->aabb
    // abcdef-badcfe
    // abc -> bac
    // c-> c
    char[] arr = str.toCharArray();// 唔charArray也可以 charAt
    for (int i = 0; i < arr.length - 1; i++) {
      if (i % 2 == 0) {
        char temp;
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    return Arrays.toString(arr);
     }

      public static String S2 (String str){
        char[] chars = str.toCharArray();
        char temp;
        for(int i = 0; i < chars.length-1; ++i){
          if( i % 2 == 0){ // [0] [1] [2]
            // Swap
          temp = chars [i];
          chars[i] = chars[i+1];
          chars[i+1] = temp;
      }
}
      return String.valueOf(chars);
      }
    }