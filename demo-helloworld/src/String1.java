public class String1 {

  public static void main(String[] args) {
    String str = "I am happy, but raining";
    str = str + ".";
    System.out.println(str);// I am happy, but raining.
    

    //Method
    //length()
    int i = str.length(); // length(), tool to return the length of str 捉住個變量去DOT 1 D野出黎即 str有幾多長度
    System.out.println("i=" + i );// convert i to String "24 -> "i=24"

    System.out.println("hello".length());//5 print一個 hello，再跟據呢個呢個變量而length，再print, that's why = 5

    //equals()
    String str1 = "abc";
    String str2 ="abcd";
    String str3 ="abc";

    boolean areTheyEqual = str1.equals(str2);// false
    boolean areTheyEqual2 = str1.equals(str3);//true
    System.out.println(areTheyEqual);
    System.out.println(areTheyEqual2);
    boolean b4 =str2.equals(str1 + "d");    //true
    System.out.println(b4);//true


    //chatAt(2), find the char at index 2 of the string
    String str4 = "helloworld";
    //index 0 of str4 ->'h'
    //index 4 of str4 ->'o'
    //index由0開始，所以index 2即第三個字母
    System.out.println(str4.charAt(2)); // result:l
    System.out.println(str4.charAt(20)); // 原理上唔會錯，因為可以WORK的，所以無紅線)
    





  }
  
}
