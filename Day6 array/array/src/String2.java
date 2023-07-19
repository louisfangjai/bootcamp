public class String2 {
  public static void main(String[] abc){
    // method signature = method name + parameter type & quantity

      //trim(), remove leading space and trail space    
      String str = "hello      ";
      String str2 = "  he llo  ";
     // str = str.trim(); 先係assign
      System.out.println(str);
      System.out.println(str2);
      System.out.println("str.trim()="+str.trim()); // hello, 沒有改變到str，只是拎結果
      System.out.println("str.trim()="+str2.trim());// he llo左右space無左

      // startsWith(), check if the string start with the target string
      if(str.startsWith("hel")){
          System.out.println("The string starts with hel");
      }
      // endsWith(), check if the string ends with the target string
      boolean endsWithSpace = str.endsWith(" "); //同上面做法一樣，只不過今次boolean set variable
      if (endsWithSpace){
        System.out.println("The string ends with space");
      }

      //indexOf(char)  or indexOf(char)
        str.indexOf('a'); //你入char i.e int 所以用 indexOf(int)
        System.out.println("The index of o in str="+ str.indexOf('o'));//4, if有兩個都係o 只係show first,indexOf(int)
        // indexOf(String)
        System.out.println("The index of ll in str="+ str.indexOf("ll")); //2, 計第一個 l，indexOf(string)
        System.out.println("The index of lll in str="+ str.indexOf("lll")); // -1,check唔到就-1
        System.out.println("The index of o in str, search from index 5 = "+ str.indexOf('o',5)); // -1 //本身default由 index 0開始
        System.out.println("The index of ll in str, search from index 3 = "+ str.indexOf("ll",3)); // -1

        // lastIndexOf(int), the last ocurrence  of the char in the string
        String str3 = "hello";
        System.out.println(str3.lastIndexOf('l')); //3 ,最後出現的position
         System.out.println(str3.lastIndexOf("ll")); //2
          System.out.println("test " + (str3.lastIndexOf('l',2))); // 2 ,

          //replace
          String s = "Java is a programming Java language";
          System.out.println(s.replace("Java","Python")); // char sequence -> String Python is a programming language, replace曬
          System.out.println(s); // s無改變到野
          System.out.println(s.replace('p', 'q'));
          
          //equals(), equalsIgnoreCase()
          if("hello".equals(str3)){ //true
            System.out.println("str3 = hello");
          }
          if("Hello".equals(str3)){ //false, case sensitive
            System.out.println("str3 = Hello");
          }
          if("Hello".equalsIgnoreCase(str3)){ //true, non case sensitive
            System.out.println("non case sensitive checking");
          }
          if("HELLO".equals(str3.toUpperCase())){ // true
            System.out.println("Alternative");
          }

          //concat(String), append something
          String newString = str3.concat(" Java!"); // +operation, str3無轉變
          System.out.println("newwString=" + newString);// hello Java!
          newString=newString.concat(" Java!");
          System.out.println(newString);
          str3 =str3.concat(" Java!");
          System.out.println("str3=" + str3); // hello Java!

          //compareTo
          String apple = "apple";
          String facebook = "apple";
          System.out.println(apple.compareTo(facebook)); // -5, 97 -102 ('a'-'f') 淨係睇第一個character apple-facebook, 如果facebook放前就f-a
    }
}
