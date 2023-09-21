package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*; // .*包曬所有野
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//@TestInstance(TestInstance)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)//default
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Assert Method Tests")
public class AbcdTest {

  private  int x; //instance variable

  @Test
  @DisplayName("AssertEquals Test")
  void testAssertEqual(){
      //Assertions.assertEquals(actual value, expected value);
      assertEquals(5,App.add(2, 3));
      assertEquals(7,App.add(2, 5));
      assertEquals(0,App.add(0, 0));
      assertEquals(-8,App.add(-6, -2));      
      x++;
      assertEquals(1, x);
  }
    @Test
    void testAssertNotEqual(){
        assertNotEquals(4,App.add(1,2)); // test run 2
              x++;
              x++;
              ++x;
      assertEquals(3, x);
      
    }

    @Test
    void testAssertTrue(){
      assertTrue(12==App.add(7,5));

    }

    @Test
    void testAssertFalse(){
      assertFalse(13==App.add(7, 5));
    }

    @Test
    void testAssertNull(){
      String str = null;
      assertNull(str);
    }

    @Test
    void testAssertNotNull(){
      Student student = new Student();
      assertNotNull(student.getSubjects());
    }

    @Test
    void testAssertThrows(){
      assertThrows(ArithmeticException.class,()->{
        App.divide(10, 0);
      });

      assertDoesNotThrow(()->{
        App.divide(10, 5);
      });
    }

    @Test // Timeout情況
    void testAssertTimeout(){
      assertTimeout(Duration.ofMillis(100),()->{ // set Time limit (0.1s)
        Thread.sleep(5);//ms, <<實際放D methods落去!
      });
      }
    @Test
    void testCombine(){
      assertAll( // and case
        ()->assertTrue(10>3),
        ()->assertEquals(10,App.add(4,6)),
        ()->assertNull(null)
      );
    }
    
    @Test
    void testSame(){
        String s1 = new String("JUnit");
        String s2 = new String("JUnit");
        assertNotSame(s1,s2); // test object reference, same出Object reference
        assertEquals(s1,s2);

        String s3 = "JUnit";
        String s4 = "JUnit";
        assertSame(s3,s4);
        assertEquals(s3,s4);

    }

    public static void main(String[] args) {
      AbcdTest t1 = new AbcdTest();
      t1.testAssertEqual();

      AbcdTest t2 = new AbcdTest();
      t2.testAssertNotEqual();
    }
}
