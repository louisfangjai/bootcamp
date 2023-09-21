public class StringSplit {
  
  public static void main(String[] args) {
    String s ="abc def xyz";
    for (String str: s.split(" ")){ //s.split>array
      System.out.println(str);
    }

    System.out.println("\\"); // print \

    char a = '\\';
    System.out.println(a); // print \
    for (String str: s.split("\\s")){ // \s means space, double\\因為有引號 得一個\ 會破壞
      System.out.println(str);
    }
    System.out.println("分隔" );
    String s2 = "  abc   def xyz pld";
      for (String str: s2.split("\\s")){ // \s means space, double\\因為有引號 得一個\ 會破壞
      System.out.println(str); // 多過一個space佢就分隔返 acb之後分完一個space 仲有兩格space
    }
    System.out.println("分隔");
    for(String str : s2.trim().split("\\s+")){ //s+多一個space 都當一個spasced
      System.out.println(str);
    }
  }
}
