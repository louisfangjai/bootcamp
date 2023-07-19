public class DataType {

  public static void main(String[] args) {
    // number,Text
    int num;// int is a way to declare a variable
    // from now on,System.out.println(3); you can only put integer to variable num.
    num = 3; // from right to left --> Action: assignment間屋有個3
    //Delcartion + Assignment
    int n = 10;
    System.out.println("3");
    System.out.println(3);
    System.out.println(num);
    // System.out.println(num);



    //Text
    String str="hello ";
    System.out.println(str);
      
    //String str2 = 1; //error
    //int num2 = "hello"; error string唔可以放數字

    // Re-assignment (num呢間屋唔一定係一世係3)
    num = 10;
    //floating point
    //int num3 = 1.1 // because int can only store integer 
    double f = 1.03;
    double f2 = 1; // it's work and will explain later，JAVA默許左integer可以用好多個1

    //byte,short,long (byte較少用)(大部份用int>21億<心入面知)
    byte b = 127;
    //byte b2 = 128; //eror,out of range
    byte b3 = -128;
    //byte b4 = -129;//error
    System.out.println(b3);
    short s =23;
    short s2 = -60;

    long l = 400;
    long l2 = 1000;
    long l3 = 30L;//norm -> L, but not l
    System.out.println(l2);
    System.out.println(l3);



    //floating point> double/float
    float f3 = 1.000003f;//norm -> f, but not F
    System.out.println(f3);
    double d4 = 23.9d;
    System.out.println(d4);

    //char, value should be assigned by single quote' '
    char gender = 'M'; 
    char s10 = ' '; // 一定要有character所以space都要
    System.out.println(gender);
    // char empty = " "; //error double space就唔得

    //boolean
    boolean isMale = true;
    boolean isSalaryGreaterThan1000 = true;
    boolean isValid = false;

    System.out.println(isValid);

    //initialization, means the 1st time of assignment
    int a10 = 0; //default value is 0
    //short a10 = 2; NOT OK因為一間屋只可以assign一次，可以再assign
    
    a10=100;

    System.out.println(a10);

    //String + operation
    String str1 = "something";
    String str2 = " something2";
    String result = str1 + str2;
    System.out.println(result);//something something2

    String result2 = "something" + " something2";
    System.out.println(result2);
    System.out.println(result+" "+ result2);  //something something2 something somethings

    String str3 = "abc" + 13;// default behaviour; convert 13 to string
    //abc13

    String str4 = "abc" + 'A'; // abcA 'A' -> String "A",abcA
    String str5 = "abcd" + true;
    System.out.println(str5);//abcdtrrue
    String str6 = "A" + 'B';

    //String str6 = 13 + 13;//error
    String str7 = " " + 13 + 13; //13 -> String"13",resut: 1313 用舊STRING 帶住野令13,13變埋做string
    System.out.println("str7 = " + str7);



    //
    int a = 1 + 3; //4
    int b10 = 1 - 3; //-2
    int c10 = 2 - 80;//-78
    int i = 2 * 101;//202
    int p = 10/3; // ~3 唔會3.33，無4捨5入concept，*唔可以除0!e.g 10/0

    System.out.println(p);
    int o = 10 % 3;//1,1 is remainder
    int o2 = 11 % 3;
    System.out.println(o);
    System.out.println(o2);






  }
}
