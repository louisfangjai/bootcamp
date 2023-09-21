import java.util.Arrays;

public class IDID942 {
  public static void main(String[] args){

    String str = "IDI";
    // String str2 = String.valueOf(str);
    // System.out.println(str2);
    int min = 0;
    int max = str.length();
    int [] intt = new int[str.length() + 1];
    for ( int i =0; i < str.length();i++){
      if(str.charAt(i) == 'I'){
           intt[i] = min++;
        } else{
          intt[i] = max--;
        }
        intt[str.length()]=min; //last character
    }
    System.out.println(Arrays.toString(intt));
    System.out.println("str = "+str);
}

  }
