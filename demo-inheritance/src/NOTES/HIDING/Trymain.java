package HIDING;

public class Trymain {
public static void main(String[] args) {
  Subh s1 = new Subh();
  System.out.println(s1.number); // 2 subclass
  System.out.println(((Superh)s1).number); // 1 super class
}
}