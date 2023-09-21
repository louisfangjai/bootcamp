import java.util.Arrays;

public class Mathsss {
    public static void main(String[] args)  {
        System.out.println(Math.round(5.4));// Result:5
        System.out.println(Math.round(5.5));// Result:6
        System.out.println(Math.round(5.44));// Result:5
        System.out.println(Math.round(5.45));// Result:5


        int num = -25;
        if(num>0 && Math.sqrt(num)==5){ //睇左 左面先，if num<=0,exit ，用and去防守
            //dosomething
        }
            Math.random(); // 0.0 - 1.0 (0.0至1.0之間)
            //base10
            //log10 -> 1
            //log1000 ->3
            //base2:
            //log8->3
            double number = 2.0; // The number for which we want to calculate the natural log
            double naturalLog = Math.log(number); //ln
            System.out.println(naturalLog); //0.69......
            System.out.println(Math.E);// 2.71......
            System.out.println(Math.log10(1000)); // 3.0

            int[] nums = new int[]{-100,100,90,50};
            // -100->100
            // 100 +100 +90 +50
            int sum=0;
            for( int i =0; i< nums.length; i++){ //10 sec
                sum +=Math.abs(nums[i]);
            }
            System.out.println(sum);
            //
            double[]arr = new double[] {-5.64,5.23,9.888,6.55};
            int total =0;
            for(int i = 0; i < arr.length; i++){
                total+=Math.round(Math.abs(arr[i])); // total = total +Math.round(Math.abs(arr[i])) >error
                // total = total + (int)Math.round(Math.abs(arr[i])) -> OKAY!
            }
            System.out.println("total = "+total);

            int cubeLength = 3;
            double volume = Math.pow(cubeLength, 3); //9

            int[] bases = new int[]{2,3,4,5};
            int[] index = new int[]{3,4,5,6};
            int[] result = new int[bases.length];
            for(int i = 0; i< bases.length; i++){
                result[i]= (int)Math.pow(bases[i], index[i]);
            }
            System.out.println(Arrays.toString(result));
    }
}
