public class test { //大細階
  public static void main(String[] args) {

    // 
    // Q2: logicalOperators(K)
    int x = 5;
    int resulta = (x++ + 2) * x++; // 42 // 17
    System.out.println("The resulta is " + resulta);
    System.out.println("x = " + x); // 7
    x = 5;
    int resultb = x++ + 2 * x++;
    System.out.println("The resultb is " + resultb); // 17//2*5->10, x=6,x=7, 5+2*6=17左至右
    System.out.println("x = " + x);// 7
    // if ++x -> 18
    //int x2 = 1;
    //x2 = x2 + 1;
   // x2++; // means x = x+1;
    //System.out.println("x2 = " + x2);// 3
    int k = 1;
    k = k + 1;
    int h = k++ + 2;
    System.out.println("h = " + h);// 4

//ctrl+ shift P > user setting

    // Q3: else / else if 去代替if(number % 2 == 0)，效果做到出黎但meaning會唔會唔一樣?
    int number = 11;
    if (number % 2 == 1) { // checking if number is an odd number
      // do something here
      System.out.println("number is an odd number"); // use else instead of if?
    }
    if (number % 2 == 0) { // checking if number is an even number
      System.out.println("number is an even number");
    }
     //Q5: if 可以一直if or else if收尾，if 1個個，但用左else if 若無else米包唔曬D情況都OK?

    // Q4: .equals vs ==
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }
    String str2 = "Tuesday";
    if (str2 == ("Tuesday")) { // 雖然OK，但string記住要用.equals instead of ==?
      System.out.println("str2 = Tuesday");
    }

   
    //Q6: SWITCH機制 (i)all no breaks> SUNDAY, wednesday break>3, but thur/fri/sat/sun break> thur,fri,sat,sun(under wed is close)
    //Q7: 實際工作問題:exercise problem quest1,4 其實係知print的result反推出黎是正常嗎 =11果條同last problem
    //Q8(K): 實際工作問題quest2 本身有! 如果del !其實就出 <27 效果,但可否保留!情況下照出到相同結果,concept上岩嗎?/一樣
    // concept外，present工作上是否盡量唔好改佢原有野，寧願之後D code就返佢?
//Q9.present問題(K)
    // String str3 = "I love Java. I love coding";
    // if (!(str3.length() >= 27)) { // code here. Fix the bug.
    //   System.out.println("str3 length < 27");
    // } else if (str3.length() == 27) { // add the condition
    //   System.out.println("str3 length = 27");}
    //   else
    //   {
    //     System.out.println("str3 length > 27");
    // }
    // Q9:delcare problems
    // int x =1
    //之後唔可以 int x = 2; or float x=2.0f; (但係for情況就可以? int i=)
    // String特性~ DATA TYPE 將integer變左做string
   //Q1外國market，IT市埸點
    //Q10: file name 大細階
    //boolean

    //Project question: why need workspace?
    // i問題，(0,0);  max can find i?
    // double包曬,LONG
    // array > char
      



    }
  }
  

