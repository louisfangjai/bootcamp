

public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res = palindrome(13431); // true
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false
    System.out.println("res = " + res);
    System.out.println("res2 = " + res2);
    System.out.println("res3 = " + res3);
    System.out.println("res4 = " + res4);
    System.out.println("res5 = " + res5);
    
  }

  // Code a method here to return true if the integer is palindrome, otherwise false
  public static boolean palindrome(int x) {
    String str = "";
    str+=x;
    char[] orginal = str.toCharArray();
    char[] reversed = new char[orginal.length];
    int rindex=0;
    for( int i =orginal.length-1; i>=0;i--){
      reversed[rindex]= orginal[i];
      rindex++;
    }
    for (int i = 0; i < orginal.length; i++) {
      if (orginal[i] != reversed[i]) {
       return false;
      }
       }
    return true;
  }
  
  public static boolean p(int x){
    String str = Integer.toString(x);
    char[]char1 = str.toCharArray();
    for( int i = 0; i< char1.length;i++){
    
   if(str.charAt(i) != str.charAt(str.length()-i-1)){
      return false;
   }
  }
    return true;
  }
}
