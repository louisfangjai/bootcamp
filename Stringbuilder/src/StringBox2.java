import java.util.Arrays;

public class StringBox2 {

  char[] string; // 一個class都可以係array
  // String string2;

  public StringBox2(){

  }
public StringBox2(char[] sources){
  //approach 1
  // this.string = new char[sources.length]; // new object
  // for (int i =0; i< sources.length;i++){
  // string[i] = sources[i];
  // }
  // approach2
  // copyOf() -> new array object, and with the copy values of the original
  this.string =Arrays.copyOf(sources, sources.length); // char[] original, int newlength
  // this.string = sources; // pass by reference, 呢個this.string係一個char array
  // this.string2= sources2;// pass by value
}
///////////////////////////////////////////////////////////////////////////

  public StringBox2 append(String s){ // hello -> helloworld
    // String -> toCharArray()
    char[] res = new char[this.string.length+s.length()]; // 新array長度
    int idx = 0;
    int j = 0;
    while(j < this.string.length){
      res[idx]=this.string[j];
      idx++;
      j++;
    }
    j=0;
    while(j < s.length()){
      res[idx]=s.charAt(j);
      idx++;
      j++;
    }
    this.string = res;
    return this;
  }

public String toString(){
  return String.valueOf(this.string); // [a,c,b]
}
public static void main(String[] args){
  char[] chars = new char[] {'a','c','b'};

  StringBox2 box = new StringBox2(chars);
  System.out.println(box.toString()); // acb

  chars[1]='x';
  System.out.println(String.valueOf(chars)); // axb
  System.out.println(Arrays.toString(chars));// [a,x,b]
  System.out.println(box.toString()); //acb
  // System.out.println(Arrays.toString(box)); < why doesn't work? line 57 vs line 58
  System.out.println(box.append("def").toString()); //acbdef ，有無 toString都print到?
}
}
