import java.util.Arrays;

public class Stringgbuilder {
    public static void main(String[] args)  {
        StringBuilder s = new StringBuilder("Hello"); // StringBuilder is Constructor, StringBuilder 快過就咁STRING
         // s->address(reference)
        s.append(" world"); // append() is faster than "+" in String
        System.out.println(s); // Hello World
         System.out.println(s.toString());//String -> "Hello World", toString 其實係getter 
         s.append(1.3f);
         System.out.println(s.toString());
        //Hello World1.3true4000
         System.out.println(s.append(true).append(4000L).length()); // *append是method可以method仲可以method( method call method)

         String str =" he llo  ";
      String [] strs = str.trim().replace('h','e').split(" "); //由左邊睇到
      System.out.println("str = "+str);
      System.out.println(strs.length);
      System.out.println(Arrays.toString(strs));

      StringBuilder s2 = new StringBuilder("start");
      //Approach 1
      System.out.println(s2.append('a').toString().charAt(3)); //r
      //Approach 2
      StringBuilder s3 = s2.append('a'); // append完都係stringBuilder
      String s4 =s3.toString();
      System.out.println(s4.charAt(3)); //r

      //insert
      String s10 = "hello"; // how to insert a space between ll
      StringBuilder s11 = new StringBuilder("hello");
      s11.insert(3,' '); // 3位食，第三個位加space ，第三個位變做space之後向後吞，length會改變 // rerturn StringBuilder
      System.out.println("s11 = "+s11); // hel lo
      s11.insert(0,"world").append("world"); // insert任意位置，appeend就最後放，append快，整條新array
      // why not s11 =.... why don't we assign back to
      System.out.println(s11); //worldhel loworld

      System.out.println(s11.deleteCharAt(3).toString());//(del走3位)
        System.out.println(s11.append("abc"));//wordhel loworldabc

        Integer a = 10;
        System.out.println(a+10); //20
        System.out.println("a = "+a);//a =10

        s11.setCharAt(4, 'j'); //void
        System.out.println(s11.toString()); // wordjel loworldabc
    }
}
