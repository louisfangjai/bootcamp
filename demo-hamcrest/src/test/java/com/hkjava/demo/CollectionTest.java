package com.hkjava.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class CollectionTest {
  
  @Test
  void testList(){ //唔洗特登打Public因為唔係被人call
    List<String> strings = Arrays.asList("apple","banana","cherry");
    assertThat(strings, hasItem("cherry"));
    assertThat(strings, hasItems("cherry","banana"));
    assertThat(strings, hasSize(3));
    // number of items+ ordering
    assertThat(strings, contains("apple","banana","cherry")); //ordering重要
    assertThat(strings, not(contains("apple","cherry","banana"))); //次序不同
    assertThat(strings, not(contains("apple","cherry"))); // 數量不同
    // number of items + ignore ordering
    assertThat(strings, containsInAnyOrder("apple","cherry","banana"));
    assertThat(strings, not(containsInAnyOrder("apple","banana")));

    List<String> emptyList = new ArrayList<>();
    assertThat(emptyList, empty()); // empty != null, .size=0
  }

}
