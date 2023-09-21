package Q2;

public class smallPig {
 
  public int normalMethod2(int n){
    int []arr =new int[]{1,3,5,7,9,11,13};
    // Iterating over an array
    int total =0;
    for(int i=0; i< n; i++){
      total+=arr[i];
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(smallPig.normalMethod(4));
  }
}
