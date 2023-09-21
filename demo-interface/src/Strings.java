public class Strings implements CharSequence{
  
  char[]arr;// "abc"-> [a,b,c]

  private Strings(String str){
    arr=new char[str.length()]; // 用array形式儲住佢，new左未放野
    //toCharArray()
    for(int i =0; i<str.length();i++){
      arr[i] = str.charAt(i); // string.charAt()
    }
  }

  public static Strings valueOf(String str){
    return new Strings(str);
  }
/////////////////////////////////////////////////////////////////////////////

  @Override
  public int length(){
    return arr.length;
  }
  @Override
  public char charAt(int idx){
    return this.arr[idx];
  }
  @Override
  public CharSequence subSequence(int start,int end){
    if( end < start|| start < 0|| end < 0
    || start> this.arr.length-1|| end> this.arr.length){
              return String.valueOf(this.arr);
    }
    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder();
    for( int i = start; i < end;i++){ // end-1
      sb.append(this.arr[i]);
    }
    return sb.toString();// String
  }
  // @Override
  // public CharSequence subSequence2(int start,int end){
  //    if( end < start|| start < 0|| end < 0
  //   || start> this.arr.length-1|| end> this.arr.length){// 1.end must > start 2. start,end can't be -ve 3. start最大都係arr.length-1 4.end最大只是arr.length
  //             return String.valueOf(this.arr);
  //   }
  //   String result = "";
  //   for(int i = start; i< end;i++){
  //     result+=this.arr[i];
  //   }
  //   return result;
  // }

  public static void main(String[] args) {
    
    //CharSequence is a Interface
    // who implements it?
    //String! i.e. String有一個合約
    String str = "abc";
    Strings s = Strings.valueOf("abc"); 
    System.out.println(s.subSequence(1, 3));//bc
  }
}
