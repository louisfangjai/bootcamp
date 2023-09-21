package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
// Permethod每次新object
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BeforeAfterTest {
  private int x;

  @BeforeEach // Before Each test
  void configuratiob(){
    assertEquals(0,this.x);
    this.x+=3;
  }
  @AfterEach
  void endOfTest(){
    System.out.println("endOfTest Start");
    this.x-=2;
    System.out.println("ended. x="+this.x);
  }
  @Test
  void testAdd(){
    System.out.println("testAdd Start");
    assertEquals(8,App.add(this.x,5));
  }

  @Test
  void testAdd2(){
    assertEquals(8,App.add(this.x,5));
  }
}
