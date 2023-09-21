import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args){
      //search
      char target = 'm';
      char[] chars = new char[]{'j','p','m','m','q','c'};
      // loop to find the index of the target in array chars
      for(int i = 0; i < chars.length; i++){ //loop曬成個array先
        if ( chars[i] == target){
          System.out.println("index= "+ i + " ,found");
        }
      }
      // toay()
      // linear search由頭搵到尾
        String str = "I am a boy."; // 11 characters
        char[] arr = str.toCharArray(); // /length11 你連佢長都唔洗知，assign左 char array ge位
        //System.out.println(arr[11]);//error
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        //[I,  , a, m,  , a,  , b, o, y, .]

        // Find Max. value in the array
        int[] nums = new int[] {240,800,-88,6,98};
        int max = 0; // The min. of int
        // for loop
        for (int i = 0; i < nums.length; i++){ //.num lengths =5
          // i =0, nums[0] ->240
          if (nums[i] > max){
            max=nums[i];
          }
          }
          System.out.println("max= "+ max); // ,ax 800
          // Find Min. Value in the array
          int[] nums2 = new int[] {240,800,-88,6,98};
          int min = 999999  ;
          for (int i = 0; i < nums2.length; i++){
            if ( nums2[i]< min){
              min = nums2[i];
            }
          }
          System.out.println("min= "+ min); // min -23
        }
    }

