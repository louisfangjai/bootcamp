package lambda;


import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {
  
  public static void main(String[] args) { // UnaryOperator extends Function<T,T> 一定要一樣
    
    UnaryOperator<String> uppercase = str-> str.toUpperCase();
    System.out.println(uppercase.apply("hello"));// HELLO

    BinaryOperator<String> concat = (s1,s2)-> s1.concat(s2); // 能用.concat method因為你定義左佢做String
    System.out.println(concat.apply("Hello","World"));//HelloWorld


    SuperUnaryOperator<String> concat2 = 
    (s1,s2,s3)-> s1.concat(s2).concat(s3);
    System.out.println(concat2.apply("abc","def","ghi"));//abcdefghi
  }
}
