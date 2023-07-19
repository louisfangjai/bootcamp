import java.util.Arrays;

public class BubbleSort {
  
  public static void main(String[] args){
    //[5,1,4,2,8]
    //step1 將最大放去曼後
    //step 1.1:[1,5,4,8,2](swap 1,5)
    //step 1.2:[1,4,5,8,2](swap 4,5)
    //step 1.3:[1,4,5,8,2] (No swap, due to 5 <8)
    //step 1.4:[1,4,5,2,8](swap 2,8)
    //step 2.1:[1,4,5,2,8](No swap, due to 1 < 4)
    //step 2.2:[1,4,5,2,8](No swap, due to 4 < 5)
    //step 2.3:[1,4,2,5,8](swap 2,5)
    //step 2.4:[1,2,4,5,8]
    //...
    //target [1,2,4,5,8]

      int[] nums = new int[] {5,1,4,2,8};
      System.out.println(Arrays.toString(sort(nums)));
  }
public static int[] sort(int[] arr){
   int temp;
   for ( int i = 0 ; i < arr.length-1; i++){ // i 是指次數, 2是2round, 第1 round將8放後,玩4round完 0,1,2,3
    for( int j = 0 ; j < arr.length - i - 1; j++){ //
      if(arr[j] > arr[j+1]){
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
   }
return arr;
}
}
