public class Student<T extends Number> {
  
  T data;
// public class Student{
// ...String data;
// .... Double data; generic 就係唔想你係咁寫class,save time


  public static void main(String[] args) {
      Student<Integer> student = new Student<>();
      Student.getThing(2);
  }

  public T getData(){ // cannot比範圍
    return this.data; 
  }
    public static <S> S getThing( S data){ // 同上面個 T 無關係 2.static method要寫range
      return data;
    }
}