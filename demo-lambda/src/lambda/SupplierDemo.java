package lambda;


import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo { //唔食野，淨出野
  
  public static void main(String[] args) throws Exception {
    Supplier<LocalDate> now = ()-> LocalDate.now();
    System.out.println(now.get()); // 2023-08-16

    test(now, LocalDate.of(2023, 8, 20));

    Supplier<Integer> random = () -> new Random().nextInt(3); // 0,1,2
    //test(random,3);
    System.out.println(random.get());//0,1,2

  }

  public static <T> void test(Supplier<T> testcase, T result)//
    throws Exception{
    if(testcase.get().equals(result))
      return;
    throw new Exception();
  }

  // No BiSupplier 放野出去絛得放兩個
}
