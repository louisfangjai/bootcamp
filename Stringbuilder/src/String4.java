public class String4 {
    //String Literal Pool + String is immutable

  public static void main(String[] args){
    String str ="abc"; // str, str2 object reference
    String str2 ="abc";
    System.out.println(str.equals(str2)); //true, "abc" is same as "abc"
    System.out.println(str == str2);//true, same value (Literal Pool) ,address same???!!! point to 同一個object, 地址一樣

    //String Literal Pool -> "abc"
    String str3 ="abcd";
    System.out.println(str.equals(str3)); // false, check content(check value)
    System.out.println(str == str3);//false, their address are not same
    //Wrapper class pass by value
    str = "abc100"; // 唔會改寫abc個波，反而create左abc100個新波
    // because "acb100" is not eqeual to "abc" -> immutable-> new String object
    System.out.println("5  "+(str == str2)); //false 
    // str2 ="abc"; 仍指舊果個波
    //String is immutable
    Integer a =10;
    a = a+20; // 右邊的a 是copy出黎，左面的a 是address
    System.out.println(a+10);
    
    String temp =str;
     str = new String("abc100"); // new object
    System.out.println(temp == str);//same values, but false,地址唔同 , 2個abc100波?
    

    String str7 = new String ("hello");
    String str8 = new String("hello");
    System.out.println(str7==str8); //false，2個波只是present緊hello

    String str9 = new String("Louis");
    String str10 = "Louis";
    System.out.println(str9==str10);//false，有2個波只是present緊hello

    String str12 = new String("Louis").intern();
    System.out.println(str10==str12);//true!



}
}