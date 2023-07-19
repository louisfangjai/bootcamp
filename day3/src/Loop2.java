public class Loop2 {
  public static void main(String[] args){
    // break

    for(int i = 0; i < 6; i++){ // 0,1,2,3,4,5
      for( int j = 0; j < 3; j++){ // 0,1,2 // continue 是去到j++，break是離開個loop
        System.out.println("i=" + i + " ,j=" + j);
        if (i == j){
          break;// this break statement just break the inner loop
        }
      }
      //break完here，不是去下個i 只是 break j 個looping, break statement只可以break 1個loop而不是 2個loop，想keep下面GE意思
    }
      // i = 0, j = 0, yes, break(print完先break)
      // i = 0, j = 1, no
      // i = 0, j = 2, no
      // i = 1, j = 0, yes
      // i = 1, j = 1, yes, break
      // i = 1, j = 2, no
      // i = 2, j = 0, yes
      // i = 2, j = 1, yes
      // i = 2, j = 2 , yes,break

      //continue, 諗下個高度總結，前面skip，後面唔skip > 記左d野
      for(int i = 0; i < 6; i++){
        for(int j = 0; j < 3; j++){
          if (i == j){
            continue; // Skip the rest in inner loop, go to next iteration
          }           // 諗下個特性:如果continue下面無野=無意思，原意就係skip左rest
          // if ( i != j){}
          System.out.println("i=" + i + ",j=" + j);
        }
      }
          // i = 0, j = 0, continue (skip)
          // i = 0, j = 1, print
          // i = 0, j = 2, print
          // i = 1, j = 0, print
          // i = 1, j = 1, continue (skip)
          // i = 1, j = 2, print

    String str ="I love programming. I love yava.";
    System.out.println("str length=" + str.length());
      //回圈次數應是變量，而不是自己set integer
      // for loop: Iteration times, based on the length of the String.
    for ( int i = 0; i < str.length();i++){ // for loop>操作數據，你唔知input幾多，str.length()係一個數字
                                            // i < 32 (0~31)
      System.out.println("Hello");

    }
      // Print the index of the character,first occurence of the character 'e'
      // Str.charAt(int index)
        System.out.println(str.charAt(2)); // l, the 3rd character in the String

      for (int i = 0; i < str.length(); ++i){
        if(str.charAt(i) == 'e'){ // True/false, charAt 用 ==
          System.out.println("index=" + i+ "," + str.charAt(i));
           break;
        }
        }
        // check if 'y' exists in the string
        // Found or Not Found
         
          //Sir Ans //for loop係去搵ans 將佢break down
          boolean found = false;
          for(int i = 0; i < str.length(); ++i){
              if(str.charAt(i)== 'y'){
                found = true;
                break;
              }           
          }
          if (found == true){
            System.out.println("Found");
          }else{
              System.out.println("Not Found");
          }
          // if the number of occurrence of target >= 3, print Yes
          // otherwise, print no
          char target = 'o';
          int count = 0;
          boolean bonous = false; //default false
          for (int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == target){
              count++;
            
            }
            //nice to have，提早break左佢
            if (count>= 3){
              bonous = true; // meet到confition變true
              break;
            }
          }
          if(bonous == true){
            System.out.println("Yes");
          } else{
            System.out.println("No");
          }



      }
  }
  

