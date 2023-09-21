import java.util.Arrays;

public class StringBox { // class

  private String string; // String -> Class
  // constructor, getter,setter

  public StringBox() { // empty constructor

  }

  public StringBox(String string) {
    if (string == null)
      this.string = ""; // 用家放null 比empty string
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public StringBox append(String str) { // 成個波 obj.append()
    if (str == null || "".equals(str)) // null唔可以.method but string can .method，不要寫str.equals("")
      return this;
    this.string = this.string + str;
    // return this.string; > return個波個string
    return this; // return StringBox object reference, return緊自己出去，成個波return
  }
  public static StringBox append(String str, String str2) { // StrightBox.append()
    return new StringBox(str + str2); // create an object of StringBox by Constructor
  }
  /**
   * 
   * @param idx Range :
   * @param s The string to be inserted
   * @return Object of StringBox
   */
  public StringBox insert(int idx, String s) {
    // idx range
    if (idx < 0 || idx > this.string.length())
      return this;
    if (s == null || "".equals(s)) //
      return this;
    // String start = s.substring(0, idx);
    // String end= s.substring(idx);
    // return new StringBox(start+s+end);
    this.string = this.string.substring(0, idx) + s + this.string.substring(idx);
    return this;
  }

  public String toString() {
    return this.string;
  }
  public char[] toCharArray(){ // no parameter
    char[]chs = new char[this.string.length()];
    for( int i =0; i< chs.length; i++){
      chs[i]=this.string.charAt(i);
    }
    return chs;
  }

  public static void main(String[] args) { // main放係邊都得，因為public class
    StringBox s = new StringBox(); // empty constructor
    s.setString("Java");
    System.out.println(s.append("Python"));// JavaPython >
    s.append("Javascript").append("HTML").toString();
    System.out.println(s);

    // String a = null;
    // a.charAt(2); //指住空氣 . method
    StringBox s2 = new StringBox(); // this.string -> null
    // s2.insert(3, "java");

    // String testNull = null;
    // testNull,equals(""); // *** null.method won't work!!!
    StringBox.append("hello", " world"); // hello world return new Stringbox
    String s3 = StringBox.append("hello", " world").toString();
    // left: normal string
    // right : call createNewWith2Ele method under class StringBox -> use constructor to create
    // a new StringBox object and returm it-> make the StringBox object to a string-> assign to the left
    System.out.println("s3 ="+s3);
    char[]result =s3.toCharArray();
    System.out.println(Arrays.toString(result));
  }
}
