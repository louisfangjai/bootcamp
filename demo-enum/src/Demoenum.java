public class Demoenum {
    

    public static void main(String[] args)  {
        // enum
        // 1.Finite number of members (有限數，不變，好似currency)
        // Example 1:( Direction : LEFT, RIGHT, UP, DOWN)
        // Example 2:(Weekday: Monday, Tuesday....)
        // Example 3:(Double Entry:Debit,Credit)
        // describle color> enum

        // 2. Growth of enum elements ( Change %) 相對固唔固定?
        
    System.out.println(Direction.EAST); // EAST (內置左放係P吋阱會call .name)
    System.out.println(Direction.EAST.name()); // EAST
    System.out.println(Direction.NORTH.toString()); // EAST
    System.out.println(Direction.NORTH);// NORTH
    System.out.println(NESW.east);

    Direction east = Direction.EAST; // TBC (heap)
    System.out.println( east == Direction.NORTH); // false
    System.out.println( east != Direction.NORTH); // true
    // == and != are checking the object reference, check緊地址同時check埋value(enum是唯一)所以唔洗.equal
    // 永遠用 ==

    // values() -> loop
    for( Direction d: Direction.values()){ // direction.values() -> static method
      System.out.println("d "+d.name()); // .values已有人寫好左
      // output跟返你次序
    }
    // ordinal 序數詞 由 0開始數
    System.out.println(Direction.SOUTH.ordinal()); //1 //i.e第幾個element跟你排列
    System.out.println(Direction.EAST.ordinal()); //0

    System.out.println(east.getDegreee()); //90
    System.out.println(east.getDirection()); //E
    }
}
