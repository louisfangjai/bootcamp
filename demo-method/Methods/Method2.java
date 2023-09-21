import java.util.Arrays;

public class Method2 {
   
  public static int product(int a, int b){
    return a * b;
  }
  public static int[] products(int[] arr){
    //{2,20,30,12,80,20}
    for ( int i = 0; i < arr.length-1; i++){ 
      arr[i] = product(arr[i],arr[i+1]); // methods入面可以call method
    }
    return arr;
  }
  public static void main(String[] args){
    int[] nums = new int[] {1,2,10,3,4,20};
    nums = products(nums);
    System.out.println(Arrays.toString(nums));
    
  }
 }
