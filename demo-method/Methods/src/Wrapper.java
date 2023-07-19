public class Wrapper {
  
    public static void main(String[] args){
      // Primitives: byte,short,........
      // Wrapper Classes, corresponding primitive

      boolean isMale = true; // isMale is not an object
      Boolean isFemale = true; // isFemale is an object reference, wrapper class
          isMale = false;
          if(isMale){

          }
          if(isFemale.compareTo(isMale) == 0){ //asking if isFemale with the same value of isMale
            System.out.println("f == 0");
          }
          isFemale = null;  // true/ false/ null
         // isMale = null; //error, primitive唔可以放null

         int num =2;
         Integer num2 = 4; // num2 is an object reference
         num2 = null;
        num2 =1000;
         String s =num2.toString(); // "1000"
         System.out.println(s);
         Integer i =Integer.valueOf("123"); //123
         System.out.println(i);
         Integer num3 =4; // Primitive有限制做唔到野，Integer但就做到好多野

         if(num3.compareTo(3) > 0){
            System.out.println("num3 is > 3");
         }
         //if (num3 > 3)
         char c = 'a';
         Character c2 = 'A';
         char result = Character.toLowerCase('B'); //static method
         System.out.println("The result is "+ result);//b

         //Difference
         Character c3 = Character.valueOf('s');
         System.out.println(" c3 is "+ c3);
         Character c4 = 's';
    }
}
