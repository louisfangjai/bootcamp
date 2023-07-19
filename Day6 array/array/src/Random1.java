import java.util.Random;

public class Random1 {
  
  public static void main(String[] args){
    int num = new Random().nextInt(3); // 0,1,2
    System.out.println(num);

   // 1-3
   int nums2 = new Random().nextInt(3)+1; // 
    System.out.println(nums2);

    System.out.println("random = "+randomAbcde());

  }

    // A,B,C,D,E
    public static char randomAbcde (){
      //Approach 1:
      // char[] chars = new char[] {'A','B','C','D','E'};
      // return chars[new Random().nextInt(5)];
      //Approach 2:
      return(char)(new Random().nextInt(5)+65); // (5): 0,1,2,3,4,  要括號成個operation
    }
}

