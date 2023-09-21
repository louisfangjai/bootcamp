public class Methods {
  
  // Method present好D(易D readable), 減少錯誤，有咩都係check method唔洗逐個逐個check
  
  
  public static void main(String[] args){ // method name: main()，//main method係最特別，有main先run到, String[], String array, args是名，你可以改abc
        String str = "hello";
        str = str + " world"; //append operation

    // Apporoach 1
    System.out.println("Hello in print() method.");
    // Approach 2
    print();//print "Hello in print() method."

    //Approach 1
    int x =10;
    int y =100;
    int m = x + y; //m=110
    System.out.println("m= "+m);
    //Approach 2
    int z = sum(x,y); //z=110
    System.out.println("z= "+ z);
    int i = sum(1000,-30); // 970 (sum呢個位可以就咁放數字)
    System.out.println("i= "+ i);
//    int o = sum("hello",123);  <---- 非法
    //if(sum(1000,-30) == 970){
      if (i ==970){
      System.out.println("the sum is 970");
    }
    //call method2
    method2("hello"); // print String=hello
    method2("github"); // print string=github
    method2(""); //無野return，並且return離開左，無行到print個動作

    double circleArea = 5 * 5 * pi();
    System.out.println("circle area= " + circleArea);
  }

  public static void print(){ //method name: print() ，封裝一個地方再print，void是指無野要return出黎
      System.out.println("Hello in print() method."); //method名先後次序唔重要，main ()外 + class()入面
      return;
  }
  public static int sum(int a , int b){ 
    // left int = return type (int sum)(製成品)
    // The int inside the bracket are parameters (材料)i.e (int a, int b)->parameter
    int c = a + b;
    return c; // 個type要一樣 int sum, int c, return c,要match type
  }
  public static double substract(int x, int y){ // 減法,  double左個名int->double upcase
      return x - y; // execute x - y first, then return the result, return可以一串野唔一定要variable
  }
  public static void method2(String str){
    if (str == null || "".equals(str)){ //null is not empty, empty ->""
      return; // 離開左 but  why void has returnn?
    }
    System.out.println("string= "+ str); // main logic, print呢個動作只是行呢個Method時但佢無return到D野出黎
  }
  public static double pi(){
    return 3.14159;
          // double p = 3.14159 有分別?
  }
}
