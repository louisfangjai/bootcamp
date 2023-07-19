public class ReverseString {
  public static void main(String[] args){
    String str = "hello";
    //output: olleh
    // str.charAt()
    // index>不一定由0開始
    String reversed = "";
    for(int i =str.length()-1; i>=0; i--){ //倒數係咁寫
        reversed += str.charAt(i); //String相加強行轉性質，=唔可以相加
        
    }
    System.out.println(reversed);




  }
  
}
