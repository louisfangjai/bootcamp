/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
    // JavaQuest19 J19= new JavaQuest19(2000,"ABC");
    // J19.year=2100;
    // System.out.println(J19.year); if 19 唔set private 係第二度就可以改
  }

  public static boolean rotateString(String s, String goal){ 
    if(s.equals(goal)){
    return true;
      }
    int count =0;
    StringBuilder sb = new StringBuilder(s);
    while(count<=s.length()){
    sb.insert(s.length(),sb.charAt(0)).deleteCharAt(0);
    count++;
    if(sb.toString().equals(goal))
    return true;
    }  
  return false;
}
  
  public static boolean rotateString2(String s, String goal) {
    return true;
  }
}
