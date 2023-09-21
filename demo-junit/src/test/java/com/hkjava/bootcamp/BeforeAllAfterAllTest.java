package com.hkjava.bootcamp;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // 用一個obj行
public class BeforeAllAfterAllTest { // File名 一定要Test
  
  private int x;
// Before 所有test 行一次，before each係每個test之後做一次
  @BeforeAll
   void beforeAll(){ // static用CLASS名.佢，但JVM
    System.out.println("beforeAll start"); // 無staticz，先有this.x concept
  }

  @AfterAll
   static void AfterAll(){
    System.out.println("afterAll start");
  }

  @Test
  void test(){
    x++;
    System.out.println("test x="+x);
      assertTrue(x==1);
  }

  @Test
  void test2(){
    x++;
    System.out.println("test x="+x);
      assertTrue(x==2);
  }
}
