public class Conditionals {
  
  public static void main(String[]args ){

    //if, else if, else
    int i = 10;
    if ( i > 9){ // asking if i > 9, if yes, execute the block of the codes即係佢Print出黎，
      System.out.println("i=" + i); //i=10
    }

    // flow control, if-else ( SINGLE IF)
    if(i<8) { // not fulfill 所以唔print出黎
      System.out.println("i is smaller than 8");
      } else{
      System.out.println("i is larger than or equals to 8");
      }

      //else-if
      if(i>12){
        System.out.println("i>12"); // not excuted
      }else if(i <= 12 && i > 0){
        System.out.println("i <= 12 and i >= 0"); //executed
      }else{
        System.out.println("i is negative"); // not executeed
      }

      int a = 2;
      int b = 5;
      int box = 0; //慣左比0先
      if(a>b){
        box = 10;
      } else{
        box = 19;
      }
      //box =19
      System.out.println("The box is "+ box);


      int number = 11;
      if (number % 2 == 1){ // checking if number is an odd number
      //do something here
        System.out.println("number is an odd number"); // use else instead of if?       
      }
      if (number % 2 == 0){ // checking if number is an even number
        System.out.println("number is an even number");
      }
      // String
      String str = "Monday";
      if(str.equals("Monday")){ // equals, ==?，記住string用 .equals
      System.out.println("str = Monday");
      }
      if(str.charAt(4) == 'd'){ //false, charAt(4) ->'a' ，記住*check char 就 ==
        System.out.println("yes");
      }
      if(str.length() > 10){ //false
        System.out.println("length > 10");
      }
      if(str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
        System.out.println("what is the result now");
      } 
      // * if 可以裝好多野 唔一定 >, <可以equals

      int score = 89;
      char grade = ' ';
      if(score >= 90){ //false
          grade = 'A'; // not executed
      } else if (score >= 80){ // true
          grade = 'B'; //executed
      } else if (score >= 70){ // checking? NO 因為上面執行左
          grade = 'C';
      } else if (score >= 60){
          grade = 'D';
      } else {
        grade = 'F';
      }
System.out.println(grade); //grade? 如果太依賴上面個條件，一修改就出面問題 e.g && ||

      
      int age = 65;
      boolean isElderly = age >= 65; //true

      // if (age>= 65){
      if(isElderly){ // true or false
        System.out.println("yes he is elderly");
      }
       System.out.println(isElderly);
     //switch，switch一定要用break，適合用有限條件/有限可能性情況> switch // 多可能性/無限數> ifelse..
     // Simple Version ， switch好處係一眼睇到曬，太多可能性就唔喝1
     int dayofWeek = 3;
     String dayName = "";
     switch (dayofWeek){ // check if the value equals to the following cases
        case 1:
          dayName = "Monday";
          break; //exit
        case 2:
          dayName = "Tuesday";
          break; //exit
        case 3:
          dayName = "Wednesday";
          //break; //exit
        case 4:
          dayName = "Thursday";
          // break; //exit
        case 5:
          dayName = "Friday";
          //break; //exit
        case 6:
          dayName = "Saturday";
          //break; //exit
        case 7:
          dayName = "Sunday";
          //break; //exit
          //default (無break焗住走)
     }
     System.out.println("dayName=" + dayName);// Wednesday


    //switch  >唔會幾百個case，一眼望曬，if then else其實都包括曬switch功能

     char grade2 = 'B';
     int pocketMoney = 100;
     switch (grade2){
        case 'A':
          pocketMoney += 100;
          break;
        case 'B':
          pocketMoney += 70;
          break;
        case 'C':
          pocketMoney += 20;
          break;
        default: //趺唔入咁多個case就中default 似else
          pocketMoney += 5;
     }
     System.out.println("pocket money=" + pocketMoney); //170
  }
}
