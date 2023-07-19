public class String1 {
  public static void main(String[] args){
      //length(),equals(),charAt()
      //isEmpty()
      String str = "hello";
      System.out.println(str.length());
      System.out.println(str.isEmpty()); // false
      String str2 =""; // empty string
      System.out.println(str2.isEmpty()); // true
      String str3 =" ";
      System.out.println(str3.isEmpty()); // false, 有space都唔係empty
      //isBlank()
      System.out.println(str.isBlank());//false
      System.out.println(str2.isBlank());//True
      System.out.println(str3.isBlank());//True

      // toLowerCase(), toUpperCase();
      System.out.println(str.toUpperCase()); //HELLO，是暫時大楷，只是temporary,str仍然細楷
      System.out.println(str); // hello
      System.out.println(str.toUpperCase().toLowerCase().isBlank()); //hello->false
      if(str.toUpperCase().equals("HELLO")){
        System.out.println("YES, it is HELLO");
      }

      // substring (startIndex,is normal index)
      //(endIndex represents the position of last character +1)
      // hello -> he
      System.out.println(str.substring(0, 2)); // he only
      System.out.println(str.substring(2, 3)); // l only (end index -1)
      System.out.println(str.substring(0, 0)); // hello, 5-1完1先係4 (0,6)->error
      System.out.println(str.substring(3)); //lo 放一個參數，開始orint 到最後
      if (str.substring(3).equals("lo")){  // not use ==
        System.out.println("yes, str.substring(3) = lo");
      }

      // contains()
      String s = "lo";
      System.out.println(str.contains(s)); //boolean true (hello contains  lo)
      System.out.println(str.contains("l"));  //false (hello NOT contains ol)隔左位的ol都唔得
      if(str.contains("lo")){
        System.out.println("str contains lo");
      }
        str = str.toUpperCase(); //到呢一刻先有assign動作
        System.out.println(str); //HELLO
        str += str.toLowerCase();
        System.out.println(str); //HELLOhello


  }
  
}
