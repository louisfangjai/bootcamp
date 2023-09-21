package swimable;


import java.util.Comparator;

@FunctionalInterface
public interface Walkk {

  public void walk();

  public static void main(String[] args) {
    Walkk w1 = () -> System.out.println("i am walking");
    w1.walk();
  }
}
