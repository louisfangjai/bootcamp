import java.util.Arrays;

public class Array{
  public static void main(String[] args){
int num = 7;
int num2 = 8;
int num3 = -30;


      // Create Empty Aray (Approach1)
    int [] nums = new int[3]; // 3 is the length of array nums數據長度 中括號
    // with index 0,1,2 (you can treat it as address)
      nums[0] = - 40;
      nums[1] = 500;
      nums[2] = -1000;
      nums[0] = 50000; // okay, reassign same address
        //nums[3] = 5; //ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 ,無呢個地址
        //nums[-1] =4; // ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3

        // your turn
        // double[]
        double [] doublee = new double[3];
        doublee[0] = 23.9;
        doublee[1] = -2323.3;
        doublee[2] = 33.4;
        doublee[1] = 5;
        // sir
        double[] arr = new double[5]; //0~4
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        //arr[1] = 'a'; //later
        //arr[0] = "123"; // Type issue 
        // char[] , int[] , String[]

        // array同loop好夾
        // System.out.println(nums[0]);
        // for loop
        //int [] nums = new int[3];
        System.out.println("nums.length= "+nums.length);
        for (int i = 0; i < nums.length; i++){ // 0,1,2, if i < 4: out of rays , nums.length run曬成個陣 // nums.length -> 3
          System.out.println("nums[" + i + " ]=" + nums[i]); //  nums[i]是地址
        }
          // reversely print array nums
        for( int i = nums.length -1; i >= 0; i--){
          System.out.println("nums[" + i + "]=" + nums[i]);
        }
        //Approach 2, create Array
        int[] array = new int[]{3,9,12}; //知曬所有data in this case 3,9,12係memory到上係隔離 好快搵得到，排好曬
        for(int i = 0; i < array.length; ++i){
          System.out.println("array[" + i +"]=" + array[i]);
        }
        // Can add a new element at tail? NO , array delcare左個長度就不能改善(加減都唔得)
        // Modify an element
        array[2] = -10;
        // Access an element
        int index = 2;
        System.out.println(array[index]); //-10
        //char[]
        char [] chars = new char [3];
        chars [2] ='a';
        chars [0] = '!';
        for (int i = 0; i < chars.length; i++){
          System.out.println("chars["+ i + "]="+ chars[i]);
        }
        long[] numbers = new long[4];
        numbers[0] =123;
         for (int i = 0; i < numbers.length; i++){
        System.out.println("numbers["+ i + "]="+ numbers[i]);
      }
        boolean[] arr2 = new boolean[2];
        arr2[0] = true;
        for( int i=0; i < arr2.length; ++i){
          System.out.println("arr2["+ i + "]="+ arr2[i]);
        } //arr2[0]=true , arr2[1]=false, boolean default is false
        
        // String
        String[] strs =new String[]{"hello","abc","goodbye"};
        strs[1] ="typhoon";
        for( int i = 0; i < strs.length; ++i){
          System.out.println("strs["+ i + "]="+ strs[i]);
        } // java最底層唔可以儲一句text,只不過變左做String
        
        String[] fruits = new String[5];
        fruits[0]="apple";
        fruits[1]="watermelon";
        fruits[2]="orange";
        //null
        //null
        System.out.println(Arrays.toString(fruits)); // 打Arrays打enter，上面有Import
        // [apple,watermelon,orange,null,null]
        byte[] bytes = new byte[6];
        bytes[3] = -4;
        System.out.println(Arrays.toString(bytes)); // 好似for loop咁 背後logic是for loop

        char[] charr = new char[5];
        charr[2]='u';
        
        System.out.println(Arrays.toString(charr));
    }
}