package com.hkjava.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*; //記得有兩個
import org.junit.jupiter.api.Test;


public class IntegerStringTest { // hamcrest接近英文 : pom有: 
    
@Test// JUnit5
 void test(){
    int value = 40;
    assertThat(value, is(equalTo(40))); // hamcrest
    assertThat(value, is(greaterThan(30)));
    assertThat(value, greaterThan(30)); // 唔寫is 都OK ,一樣意思
    assertThat(value, is(not(greaterThan(50))));
    assertThat(value, is(lessThan(60)));
    assertThat(value, is(lessThanOrEqualTo(40)));
    assertThat(value, is(greaterThanOrEqualTo(40)));
    
}

@Test
 void test2(){
    int value =20;
    assertThat(value,is(greaterThan(3)));
}

@Test
void testString(){
    String str = "Hello world";
    assertThat(str, containsString("world"));
    assertThat(str, not(containsString("world!")));

    String str2 = new String("Hello world");
    assertThat(str, equalTo(str2)); // check value of strings
    assertThat(str, is(not(sameInstance(str2)))); // check if they are same object
    assertThat(str2, is(notNullValue()));

    String nullString = null;
    assertThat(nullString, is(nullValue()));

    assertThat(str, startsWith("H"));
    assertThat(str, not(startsWith("hello")));
    assertThat(str, endsWith("world"));
    assertThat(str, not(endsWith("world!")));
    assertThat(str, startsWithIgnoringCase("hello"));

    String emptyString =""; //null is different empty
    assertThat(emptyString, is(emptyString()));
    }

    @Test
    void testLogicalMatcher(){
        int val = 42;

        //AND (allOf)
        assertThat(val, allOf(
        greaterThan(41), 
        lessThan(43), 
        greaterThanOrEqualTo(42), 
        lessThanOrEqualTo(42)
        ));
        
        //OR (anyOf)
        assertThat(val, anyOf(
            greaterThan(43), // false
            lessThan(40), // false
            greaterThanOrEqualTo(50),// false
            lessThanOrEqualTo(42) // true
            ));
    }

}
