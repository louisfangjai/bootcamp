public class ProductSequence {
  public static void main(String[] args){
    //          0,1,2,3,4,5...
    //print out 0,2,6,12,20..
    //print the first 20 numbers of the above requirement
    //sir's version
    int a,b,c; // declare 2 variables in one go
    for(int i = 0; i < 20; i++){
      a = i;
      b = i+1;//不可i++，會影響i
      c = a * b;
      System.out.println(c +" ");
    }

    int count = 0;
    for(int i = 0; i < 20; ++i){
count =i*(i+1);

System.out.println("count = " + count);
    }
      

  }
  
}
