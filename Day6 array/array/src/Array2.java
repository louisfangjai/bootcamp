import java.util.Arrays;

public class Array2 {
  
  public static void main(String[] args){

   System.out.println(swap("hello",2,4));
String strTest="louis";
System.out.println(swap(strTest,2,3));
  }

  public static String swap(String str,int idx1,int idx2){
    if(str == null){
      return null;
    }
    if(str.isBlank()){
      return str;
    }
    if (idx1 < 0 || idx1 >= str.length()){
      return str;
    }
    if (idx2 < 0 || idx2 >= str.length()){
      return str;
    }
    char[] chars = str.toCharArray();//ms
      char tem = chars[idx1];
      chars[idx1]=chars[idx2];
      chars[idx2]=tem;
      return String.valueOf(chars); // ms
    //return (Arrays.toString(chars));
        }

  }

