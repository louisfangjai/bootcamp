package ds;

import java.util.Comparator;

public class SortByDecending implements Comparator<String>{

  @Override
  public int compare(String o1, String o2){
  return o2.charAt(0)> o1.charAt(0) ?  1 : -1; // return o1.compareto o2
  }
}
