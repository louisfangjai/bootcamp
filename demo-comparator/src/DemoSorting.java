import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {
  
  public static void main(String[] args) {
    int[] arr = new int[]{4,-10,9,-20,100};
    Arrays.sort(arr); // n* logn,merge sort//   快過 n^2 (平時sorting)
    System.out.println(Arrays.toString(arr));

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(-88);
    arrayList.add(4);
    Collections.sort(arrayList); //nlogn, ascending sorting 佢sort控制左你要比list not queue佢
    System.out.println(arrayList); // [-100, -88, 4, 100]

    ArrayList<Ball>balls = new ArrayList<>();
    balls.add(new Ball(8,Color.YELLOW));
    balls.add(new Ball(1,Color.BLUE));
    balls.add(new Ball(5,Color.YELLOW));
    balls.add(new Ball(100,Color.RED));
    Collections.sort(balls); // [Ball@1f32e575, Ball@279f2327, Ball@2ff4acd0, Ball@54bedef2] <<因為ball未有toString
    System.out.println(balls); //[[id= 100], [id= 5], [id= 4], [id= 1]]
  }
}
// 
