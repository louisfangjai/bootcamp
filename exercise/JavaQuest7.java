import java.util.Arrays;

/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here
    
    int[] sum = new int[]{1,2,3,4,5,6,7,8,9,10};
    // int[]sum9 = new int[10];
    // for(int i = 0;i<sum9.length;i++){
    //   sum9[i]=i+1;
    
    int sum2 =0;
   // Write a loop to sum up all value in the int array
    // code here
    for(int i=0;i<sum.length;i++){
        sum2 +=sum[i];
    }
    System.out.println("The sum is " + sum2);

    int[] suma =new int[10];
    for (int i = 0; i < suma.length; i++){
      suma[i]=i+1;
    }
    System.out.println(Arrays.toString(suma));
    int total=0;
    for( int i = 0; i < suma.length; i++){
      total= total +suma[i];
    }
    System.out.println("total = " + total);
  }
}