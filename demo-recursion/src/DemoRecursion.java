public class DemoRecursion { // Recursion --> leetcode
  
  public static void main(String[] args) {
    //algorithm ===> algo
    System.out.println(sum2(5)); // 15
    System.out.println(sum3(5));// 5
    print(3);//321123
  }

  //Question 1:
  // k+(k-1)+(k-2)+.......+0
  public static int sum(int k){
    int sum=0;
    for(int i=k; i>0;i--){
      sum+=i;
    }
    return sum;
  }

  public static int sum2(int k){ // method call method
    if(k<1) // base condition
    return k;

    return k+ sum2(k-1);
    //15,  return
    //5+10, return sum(5) = 5+sum(4)5+10=15
    //4+6, return  sum(4) = 4+sum(3)=4+6=10
    //3+3, return  sum(3) = 3+sum(2)=3+3=6
    // 2+1,return  sum(2) = 2+sum(1)=2+1=3
    //1+0,return   sun(1) = 1+sum(0)=1+0=1
    // 0<1. reutrn 0;  sum(0) = 0
  }

   // Question 2:
   // 0,1,1,2,3,5,8,13.....kth elements
   // k=6, return 8
   // 2hr58M 09/08/2023
   public static int sum3(int k){
    //base condition
    if(k<=1)
    return k;

    return  sum3(k-1)+ sum3( k-2);
   }

   // Question 3:
   // non-tail recursion, // 2個for loop--> 會check conditions
   // 3 2 1 1 2 3, k=3
   public static void print(int k){
    //base condition
    if(k<1){
      // System.out.println("Try");
    return;
    }
    System.out.print(k+ " ");//1
    print(k-1); //print(0)
    System.out.print(k+" "); //1
   }
}
