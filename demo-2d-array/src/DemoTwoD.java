import java.util.Arrays;
import java.util.Random;

public class DemoTwoD {

   int age;

    public static void main(String[] args)  {
       int[]nums = new int[3];
       //int[] nums;-> declaration
       // new int[3]-> initialization

       nums = new int[]{1,2,3,4,5,6,7,8,9,10}; // re-assignment
       //or nums = new int[10]// no new int[10]{1,2,3,4,5,6,7,8,9,10}
       int[][] matrix =new int[3][4]; //new int[row] [column];
       // 3 rows X 4 columns

       // 1,2,3,10
       // 4,5,6,7
       // 10,2,3,1

       //random a number and assign to an 2D array (0-12) < range (need a nested loops)
       // Nested Loop

       //int[][] matrix =new int[3][4]; //new int[row] [column];
       System.out.println(matrix.length); //3 (row length)
       System.out.println(matrix[0].length);// 4 (column length of row=0)
       
       for(int i=0; i< matrix.length;i++){ //0,1,2 (i)
        // martrix[0] -> 0 row果陣., return int[]
        // 果個 int[] .length 
        // matrix[2] -> Get the idx 2 from the array of the row 0
        for( int j=0; j<matrix[0].length;j++){ //0,1,2,3 (j) , matrix[0],[1],[2] 的lengthsame
            matrix[i][j]= new Random().nextInt(13);
        }
       }
       System.out.println(Arrays.deepToString(matrix)); //deep
       //本質是 i j的組合

       // Convert 2D array to 1D array
       int idx =0;
       int[] arr = new int[matrix.length*matrix[0].length]; //12
        for(int i=0; i< matrix.length;i++){ // 0,1,2
            for( int j=0; j<matrix[0].length;j++){ // 0,1,2,3
                arr[idx++] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));

        // Convert 2D array to a String
       String str ="";
        for(int i=0; i< matrix.length;i++){ // 0,1,2
            for( int j=0; j<matrix[0].length;j++){ // 0,1,2,3
                str += matrix[i][j];
            }
        }
        System.out.println(str);

        //3D array
        int [][][] arr3d = new int[1][2][3];
        //4D array
        int[][][][] arr4d = new int[1][2][3][4];

        int[][] arr2 = new int[0][0]; // = int[][]{};

        //用個class做array
        DemoTwoD[][] demo = new DemoTwoD[2][2];
        demo[0][0]= new DemoTwoD();
        demo[0][1]= new DemoTwoD();
        demo[1][0]= new DemoTwoD();
        demo[1][1]= new DemoTwoD();

         for( int i =0; i< demo.length;i++){ // 背
            for(int j=0; j< demo[0].length;j++){  //背 0係因為set死左
                System.out.println(demo[i][j].age);// 0,0....( because of default value) print age of each demo
            }
        }
        String[][] strings = new String[][]{{"abc","def"},{"xyz","ijk"}};
        for( int i =0; i< strings.length;i++){ // 背
            for(int j=0; j< strings[0].length;j++){ //背
                System.out.println(strings[i][j]);
            }
        }
        

        int[][] image = new int[][] {{1, 2, 4}, {1, 2, 4}, {1, 2, 4}};
    for (int i = 0; i < image.length; i++) {
      System.out.println(image[i]);
    }
    }
}
