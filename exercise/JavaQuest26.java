/*
 * 
 * Question : You are given an integer array nums. 
 * The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

import java.util.Arrays;

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum2(new int[] { 1, 2, 3, 2 })); // 4
    System.out.println(sum2(new int[] { 1, 1, 1, 1, 1 }));// 0
    System.out.println(sum2(new int[] { 1, 2, 3, 4, 5, 6 }));// 21
    System.out.println(sum2(new int[] { 1 }));// 1
  }

  public static int sum(int[] nums) {
    // code here
  //   int total=0;
  //   int count=0;
  //   int temp=0;
  // for(int i=0;i< nums.length;i++){
  //   for(int j=i+1;j< nums.length;j++){
  //     if(nums[i]==nums[j])
  //         count++;
  //         temp=nums[i];
  //   }
  //   total+=nums[i];
  // }
        return 5;
    }

    public static int sum2(int[]nums){
      String numstring = Arrays.toString(nums);
    //  System.out.println(numstring);
    //  System.out.println(numstring.charAt(4));
      numstring =numstring.replaceAll(","," ").replace("["," ").replace("]"," ").replaceAll(" ", "");
      // System.out.println(numstring);
      int total=0;
      int [] arr = new int[100];
      for(int i=0; i< nums.length;i++){
        arr[numstring.charAt(i)-'1']++;
      }
      for(int j=0; j< arr.length;j++){
        if(arr[j] ==1)
          total+=nums[j];
      }
      return total;
    }
  }

