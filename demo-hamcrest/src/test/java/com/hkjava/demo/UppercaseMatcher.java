package com.hkjava.demo;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class UppercaseMatcher extends TypeSafeMatcher<String>{
  
  @Override
  protected boolean matchesSafely(String str){ // return type 跟<入面放咩e.g persons,string>
    return str.matches("[A-Za-z]+");
  }
  @Override
  public void describeTo(Description description){
    description.appendText("String should contain uppercase letter only.");

  }
    public static Matcher<String> containUppercaseOnly(){
      return new UppercaseMatcher();
    }

}
