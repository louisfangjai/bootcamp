import java.util.Arrays;

public class ForEach {
  public static void main(String[] args) {

    // basic for-loop
    for (int i = 0; i < 3; i++) {
      System.out.println("basic for loop: hello");
    }
    // For-each~look through all element, 亦無Index concept
    int[] arr = new int[] {200, 100, 3, 4};
    // for (Type Element : Dataset)
    // Difference of for-each:
    // 1. for-each do not have stop condition/ counter in loop signature (要loop曬所有野~e.g 1M野)
    //
    for (int x : arr) { // loop through all elements, 是一個寫法，但做唔到 i-- or skip~break,continue
      // int x是個代數set落去，跟據arr呢個array逐個loop落去
      System.out.println("for-each: x=" + x); // x = 200,100,3,4 成個arrayloop曬佢，代入返個x(你set)
      System.out.println(arr[0]); // but you still access element by index
    }
    // modification
    arr[0] = 8;
    // {1,4,10,13,20,0}
    // 1,0
    // 4,20
    // 10,13
    // {8,100,3,4}
    for (int i = 0; i < arr.length; i++) { // counter, i+=2
      if (i > arr.length / 2 - 1) {
        break; // 即淨係出i=0,i=1, i=2 ->break;
      }
      System.out.println("(i= " + i + " )" + "for-each: hello");
      System.out.println("arr頭尾=" + arr[i] + "," + arr[arr.length - i - 1]);
      // arr[0] = 9;
    }
    //
    String[] strs = new String[] {"hello", "world"};
    for (String str2 : strs) {
      System.out.println("for-each,= " + str2);
    }
    // Integer, Character (Wrapper Class)
    Character[] chars = new Character[] {'L', 'a', '!', '('};
    for (Character c : chars) {
      System.out.println(c);
    }

    String s2 = "Hello world ! I am Vincent";

    String[] strings = s2.split(" "); // Use " " to split the String s2
    System.out.println(Arrays.toString(strings));
    for (String s : strings) {
      System.out.println("split , " + s);
    }
    // Without using split, use a for loop to split s2
    // output: String[]
    // 1. substring[]
    String s3 = "  hello L O U I SAjjj ";
    System.out
        .println("Approach1 by method  =  " + Arrays.toString(splitt(s3)));
    System.out
        .println("Approach2 by method  =  " + Arrays.toString(splitt(" abc  ")));
  }
  // 2. toCharArray[]

  // String s2 = "Hello world ! I am Vincent";
  // Approach 1: substring[]
  // count space

  public static String[] splitt(String s) {
    int spaceCount = 0;
    String str = s.trim();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        spaceCount++;
      }
    }
    int startidx = 0;
    int idx = 0;
    String[] result = new String[spaceCount + 1]; // 1個space有2個string hello louis
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == ' ') {
        result[idx] = str.substring(startidx, i); // i個位
        idx++; // 要遇到space先加一次
        startidx = i + 1; // i果格係space +1先開始數
      } else if (i == str.length() - 1) { // last character
        result[idx] = str.substring(startidx, str.length());// 唔洗-1,因為substring endidx本身 -1
      }
    }
    return result;
  }

  public static String[] split2(String s) {
    // Approach 2: toCharArray()
    // Count Spaces
    int spaceCount = 0;
    String str = s.trim();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        spaceCount++;
      }
    }
    char[] chars = s.toCharArray();
    int idx = 0;
    String[] result = new String[spaceCount + 1];
    Arrays.fill(result,"")//assign "" to all elements
    for (int i = 0; i < chars.length; ++i) {
      if (chars[i] == ' ') {
        idx++;
      } else {
        result[idx] += chars[i];
      }
    }
    return result;
  }
}
