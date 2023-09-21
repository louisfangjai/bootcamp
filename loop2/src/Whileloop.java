public class Whileloop {
  public static void main(String[] args){
      //while
      int count = 0; //(delcare counter)
      while(count < 5){ // continue condition : True/ false
            count++;
      }
        // count = 5

        // for ( int i = 0; i<3; ++i){
        //   if ( i > 1){
        //     i++;
        //   }
        // }   
        // while loop 可以更改D條件~business meaning，while 一定有D if 去++ 有條件地去++
        boolean isHoilday = false;
        int count2 = 0;
        while(!isHoilday){ // Is not hoilday就行loop
          System.out.println("count2 = "+ count2); 
          count2++;
          if(count2  >= 6){
          isHoilday = true;
          }
        }
        int c = 0;
        while(c >= 0 && c < 5){ // c > 0 || c < 5
          System.out.println(c);
          c++;
        }
        int a =0;
        int b =10;
        while ( a < 5 || b > 0){ // while a >= 5, (false || true)
          System.out.println("a = "+a+", b = "+b+ " hello");
          a++;
          b--;
        }

        // break;
        int k = 0;
        while (k < 6){
          System.out.println("break: hello, k = "+k);
          k++;
          if( k > 3){ // or ++k>3
            break; // break左個loop佢
          }
        }
        //continue;
        int j = 0;
        while (j < 6){
          j++;
          if( j > 3){
            continue; // 大個3 skip printing
          }
          System.out.println("continue: hello, j = "+j);
        }
  }
}
