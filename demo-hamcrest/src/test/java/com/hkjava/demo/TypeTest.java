package com.hkjava.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class TypeTest {
  
  @Test
  void testIfObjectIsInstanceOf (){ 
    Object object = "Hello world"; // 而家object放string但用唔到string method
    assertThat(object, instanceOf(String.class)); // any of, all of
    assertThat(object, not(instanceOf(Integer.class)));
    

  }
  @Test
   void testIfClassIsCompatible(){ //試兩個class的關係
    assertThat(Integer.class, is(typeCompatibleWith(Number.class))); // part of it , relationships, child class
    assertThat(Integer.class, is(typeCompatibleWith(Object.class)));
    assertThat(Number.class, is(not(typeCompatibleWith(Integer.class))));

  }
}
