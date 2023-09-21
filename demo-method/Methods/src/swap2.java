import java.util.Arrays;

public class swap2 {
  public static void main(String[] args){
    int [] nums = new int[]{8,3,-10,30,100,-19};
    // //Move the max number to the tail
    // //{8,3,-10,30,-19,100}
    // Step 1: Find the inedex of the max number
    int maxIndex = 0;
    for(int i = 0; i < nums.length;i++){
      if (nums[i]>nums[maxIndex]){
        maxIndex = i; // store the index
      }
    }
      //Step 2: Swap the max number to tail
      int temp = nums[maxIndex];
      nums[maxIndex]=nums[nums.length-1];
      nums[nums.length-1]=temp;
      System.out.println(Arrays.toString(nums));
      
    // Test average(int[])
    int[] testCase = new int[] {2,3,0};
    System.out.println(average(testCase)); //~1.6667

    int[] classA = new int[]{20,30,80,40};
    int[] classB =  new int[]{90,30,100};
      if(average(classA) > average(classB)){
        System.out.println("Class A has higher average score");
      }
    }
public static double average(int[] arr){
    // calculate the average of all numbers in arr.
      int total =0; // or 呢度轉
    for( int i = 0; i < arr.length; i++){
      total +=arr[i];
    }
    //return sum/arr.length; // 5/3 -> 1->1.0
    return (double)total/arr.length; // int/int int除int永遠都係int，,,再強行守十1double
    // double/ int ---->出返double
  }

      }