/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    String a="";
    String b="";
    int i=0;
      char[]chars = s.toCharArray();
     while (i<chars.length/2){
      a +=chars[i];
          i++;
     }
     while( i< chars.length){
      b+=chars[i];
      i++;
     }
   
     System.out.println("a = "+a+"  b = "+b);
     String vowels ="aeiouAEIOU";
     int counta=0,countb =0;
     char[]charsa = a.toCharArray();  
     char[]charsb = b.toCharArray();
      char [] charsv = vowels.toCharArray();
      for( int k =0; k< charsv.length;k++){
        for( int j =0; j<charsa.length;j++){
          for( int h=0; h<charsb.length;h++){
                  if (charsa[j] == charsv[k])
                              counta++;
                  if(charsb[h] == charsv[k])
                        countb++;
          }
      }
     }
      if (counta==countb)
      return true;
      return false;
    }

  }
