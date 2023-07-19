public class LogicalOperators {

    public static void main(String[] args ) {
      boolean isExpensive = true;
      boolean isWorthToBuy = false;
      // && and
      // true,true --> true
      //true, false --> false
      //false,true --> false
      //false, false -->false
      boolean result = isExpensive && isWorthToBuy; //false ，要兩邊都係true先係true
      System.out.println("The result is " + result);
      //   || mean or Operator -> OR
      // true, true - > true
      // true, false  -> true
      // false, true ->true
      // false, false -> false
      boolean result2 = isExpensive || isWorthToBuy; //true, false >true
      System.out.println("The result2 is " + result2);

      int a = 5;
      int b = 10;
      int c =13;
      boolean result3 = a > 6 && b < 12;//false > a錯b 岩
     System.out.println("The result3 is " + result3);
      // Logical Operator (and行先)
      boolean result4 = c < 15 || a > 6 && b < 12;// true (*and會行先)(c岩or a錯B岩))true or (false and true)
      System.out.println("The result4 is " + result4);
      boolean result5 = c < 15 || (a > 6 && b < 12);// true (present會好D，但多魚，因為AND本身就行先)
      System.out.println("The result5 is " + result5);
      boolean result6 = a < 6 || b < 9 || c < 9; //true (a岩，b錯，c錯)
      System.out.println("The result6 is " + result6);

      // ==, >=, <= , != (not =)
      // ==, means asking if a equals b? -> true/false ~.equals
      // =,assignment
      boolean result7 = a == b; //false
      boolean result8 = a >= 5; //true
      boolean result9 = c <= 13; //true
      boolean result10 = c != 13; //false
      System.out.println("The result7 is " + result7);
      System.out.println("The result8 is " + result8);
      System.out.println("The result9 is " + result9);
      System.out.println("The result10 is " + result10);
      // ! -> NOT
      boolean result11 = !(c < 13); //true, not c是13只可以事件不是數字， (c<13) 是一個事件,c<13 係 false
      // asking if the event of (c < 13) is false，佢本身係false，!佢問係米not true>YES! >所以true (反轉左兩次)
      boolean result12  = ( c < 13);
      System.out.println("The result11 is " + result11 );
       System.out.println("The result12 is " + result12 ); //boolean本身問T/F
      
       boolean result13 = !(b == 9) && c != 13; //true && false -> false
        System.out.println("The result13 is " + result13 );

      // Operators Precedence先前
      int result14 = (1+9) * 3; // 30
      int result15 = ++result14 +1; //result14=32
      System.out.println("The result15 is " + result15 );
      int i = 27;
      int result16 = i++ + 1;// result16=28,i=28 ，因為result16去到 i=27果時停，事後再加1
      System.out.println("The result16 is " + result16);
      System.out.println(" i = " + i); // i=27,i++ 自己再加1,i=28

      boolean result17 = 25 + 2 < result16 + 1; //true
      System.out.println("The result17 is " + result17 );

      //
      int x = 5;
      int y = 10;
     int z = x += 3 * y ; // z=? 由右面睇到左面
      System.out.println("z = " + z); // Step1. 3* 10 ->  30, step2. 5+ 30 -->35
      x = 5; //(Reassign)
      int result18 = (x++ + 2 )* x++; // result 18 =? 42 // 17
      System.out.println("The result18 is " + result18);
      System.out.println("x = " + x); //7
      //(x++ 2) ->7, x become 6 ， 因為個++放後，所以 5+2，完左個括號之後x已經變左6
      // 7*6 -> 42, x become 7 ，++放後，後面個X拎6

      



  }
}