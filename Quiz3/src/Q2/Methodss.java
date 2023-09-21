 public class Methodss{

 
 public static int normalMethod(int n){
    int []arr =new int[]{1,3,5,7,9,11,13};
    // Iterating over an array
    int total =0;
    for(int i=0; i< n; i++){
      total+=arr[i];
    }
    return total;
  }
}