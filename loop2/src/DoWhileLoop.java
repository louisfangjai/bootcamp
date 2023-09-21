import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args){
    //do-while, do first, then check condition to start looping，永遠行左一次
    // 去present呢件事一定要執行1次，之後再視乎情況
    // while loop係中間開始一個Looping
    int count = 0;
    do{
      System.out.println("hello, count=" + count);
      count++;
    } while(count < 3);

        int input=0;
        Scanner scanner;
    do{
        scanner = new Scanner (System.in);
        System.out.println("Please a integer:");
             input = scanner.nextInt(); //拎input
      // if input is even -> continue, 
      //odd -> exit loop and print the number
    } while(input % 2 ==0);

    //if (input % 2 ==1){//
      System.out.println("input="+ input);
      scanner.close(); //->黃線，無都可以run
      //}
    }


  }

