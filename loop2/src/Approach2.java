import java.util.Arrays;

public class Approach2 {
  public static void main (String[] args){

    String s1 = "ab cd hj";
    String [] s2 = Approach2.split2(s1);
    System.out.println(Arrays.toString(s2));
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
    for (int i = 0; i < chars.length; ++i) {
      
      if (chars[i] == ' ') {
        idx++;
      } else {
        System.out.println(chars[i]);
        System.out.println(idx);
        result[idx] += chars[i];
      }
    }
    return result;
  }
}
