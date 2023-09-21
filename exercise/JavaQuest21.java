/*

Question : Given an integer n, return true if n has exactly three positive divisors. 
Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.

*/
public class JavaQuest21 {
  public static void main(String[] args) {
    System.out.println(isThreeDivisors(1)); // false
    System.out.println(isThreeDivisors(3)); // false
    System.out.println(isThreeDivisors(4)); // true, 4/1, 4/2, 4/4
    System.out.println(isThreeDivisors(12));// false
    System.out.println(isThreeDivisors(9999));// false
    
  }

  public static boolean isThreeDivisors(int n) {
    // finish the code
    int count = 0;
    int i =1;
    while(i<=n){
      if(n%i == 0){
        count++;
      }
        i++;
        if(count>3)
        break;
    }
    if (count ==3){
    return true;
    }

    return false;
  }
}