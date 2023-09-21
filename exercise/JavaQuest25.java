/*
 * Question : Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 * 
*/

import java.util.Arrays;

public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0
    System.out.println(countWords("")); // 0
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello  my name is John."));// 5
    System.out.println(countWords(" . "));// 1
  }

  public static int countWords(String s) {
    // code here
    int count=0;
    String[] ss= s.split(" ");
    System.out.println("length = "+ss.length);
    System.out.println(Arrays.toString(ss));
    for( int i =0; i< ss.length; i++){
      if(!ss[i].isEmpty())
      count++;
    }
    return count;
  }
  
}