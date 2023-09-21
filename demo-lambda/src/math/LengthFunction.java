package math;

import java.util.function.Function;

public class LengthFunction implements Function<String, Integer> { //之前要咁做
  
  @Override
  public Integer apply(String str){
    return str.length();
  }
}
