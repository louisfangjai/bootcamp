/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in 
 
 
      int a = 1, b = 1;
      System.out.println("Expected output:");
      for (int i = 0; i < 15; ++i) {
          System.out.println(a);
          int c = a + b;
          a = b;
          b = c;
          }

        }
      }