public class Loops {
  public static void main(String[] args) {

    // For loop
    int a = 0;
    ++a;
    a++;
    for (int i = 0; i < 4; i++) { // step1: delcare變數,3舊野-3個expression 1.int,2.條件 3.個i每次有D咩變化 ++i/i++ 一樣，因為係獨立expression
      System.out.println("i=" + i + ", Hello"); // 當 i = 0，滿足條件>print第一個Hello ，第三個唔洗;

      // 行右手邊，i=1,滿足條件>print第2個Hello，i=3 print第4個Hello
      // logic flow:
      // i = 0, -> 0 < 4, print 1st Hello
      // ++i -> i = 1, -> 1 < 4, print 2nd Hello
      // ++i -> i = 2, -> 2 < 4. print 3rd Hello
      // ++i -> i = 3, -> 3 < 4, print 4th Hello
      // ++i -> i = 4, -> 4 is NOT smaller than 4, exit loop
    }

    for (int j = 6; j > 0; j--) { // 你set條件，要有不被滿足的時候
      System.out.println("j=" + j); // 6 times
    }
    // 最好由 i=0 開始，唔好 i =1 開始

    // endless loop
    // for (int i = 0; i >= 0; i++){
    // System.out.println("Hello");
    // }

    int max = 10;
    int total = 0;
    for (int i = 0; i < max; ++i) {
      total += i; // 0,1....9
    } // 累積情況常用 +=
    // total=45
    System.out.println("total= " + total);


    //notes example
    int x = 2;
    for (int i = 0; i < 11; i++) {
      System.out.println("x= "+x + ",i= "+i);
      x *= 2;
    }

    // 1. Sum up all odd numbers
    // 2. Sum up all odd numbers, except 5
    int sum = 0;
    int sumOddNumWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        sum += i;
       
        // System.out.println("i = "+ i);
      }
      if (i % 2 == 1 && i != 5) {
        sumOddNumWithout5 += i;
        
    }
     
      } // 2個數 可以唔洗開2個LOOP
      System.out.println("sum =" + sum);
     System.out.println("sumOddNumWithout 5 =" + sumOddNumWithout5 );
    // sum =25, sumOddNumWithout5=20
    // 用原本IF做相同野



    int sum2 = 0;
    for (int i = 1; i <= 10; i += 2) {
      // odd numbers
      sum2 += i;
      // System.out.println("Sum2: " + sum2);
      // System.out.println("i = "+ i);
      // 1,3,5,7,9
    }
    for (int i = 0; i < 5; ++i) {
      System.out.println("i = " + i +" hello");
      if (i > 2) {
        break;
        // i = 0,hello
        // i = 1,hello
        // i = 2,hello
        // i = 3,hello
        // break;
        // break只是多個條件 for loop可以處理多個事件
      }
      
    } // 擺先擺後都影響print
    // for (int i = ; i >20;--i)

    // continue 去 loop 的下一次
    for (int i = 0; i < 6; i++) {
      System.out.println("i= " + i + " Hello!");
      if (i > 3) {
        continue; // go to the next iteration 下一個圈(skip左下面bye唔再下面GE野)
      }
      System.out.println( "Bye!");
    }
    // i=0, hello, bye
    // i=1, hello, bye
    // i=2, hello, bye
    // i=3, hello, bye
    // i=4, hello
    // i=5, hello
    // i=6, exit

    for (int i = 0; i < 8; i++) { // 2個if 即係and ，or就係else if// 做GE事一樣就可以合拼
      if (i % 2 == 0 || i % 3 == 0) {
        System.out.println("i=" + i);
      
      if (i % 3 == 0) {
       System.out.println("hello");
     }
    }
  }
    // Nested Loop
     for (int i = 0; i < 4; i++) {
       for (int j = 0; j < 3; j++) {
            System.out.println("i = " + i + ",j = " + j + " Hello!");
       }
      }
    // how many hello?
    // i=0(無野execute),J=0, hello
    // i=0, j=1,hello
    // i=0, j=2,hello
    // i=0, j=3,exit inner loop
    // i=1. j=0,hello
    // i=1. j=1,hello
    // i=1. j=2,hello
    // i=1. j=3,exit inner loop
    // i=2. j=0,hello
    // i=2. j=1,hello
    // i=2. j=2,hello
    // i=2. j=3,exit inner loop
    // i=3. j=0,hello
    // i=3. j=1,hello
    // i=3. j=2,hello
    // i=3. j=3,exit inner loop
    // i=4, exit outer loop

    // *
    // **
    // ***
    // ****
    // *****
    ///////////
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    // System.out.println(); nextline after print out
    // System.out.print(); continue after print out, no nextline
    // System,out.print() is nor allowed
    // Tips: string
   
    // Approach 1: Nested Loop
    // System.out.println() & System.out.print()
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    // Approach 2: Single Loop & String
    // System.out.println()
    String str = "";
    for (int i = 0; i < 5; i++) {
      str += "*";
      System.out.println(str);
    }
    // Approach 3: Nested Loop & String
    // System.out.println()
    str = "";
    for (int i = 0; i < 5; i++) {
      str = "";
      for (int j = 0; j < i + 1; j++) {
        str += "*";
      }
      System.out.println(str);
    }


  }
}

