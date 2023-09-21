public enum Direction {   // enum是好特別的keyword
  // special keyword since Java1.5
  // 類別 用 enum
  //  1. public class Direction extends Enum，所以Direction無得再extends野
  // 2. enum is final class 

  //全局唯一 object，無得new..無得兩個東.但有constructor
  //complie time已經決定左2
  //全局唯一 ,4 objects ( EAST, SOUTH , WEST, NORTH)
  // new Direction ("EAST"), //new Direction('E')
  EAST('E',90), // 括號屬於EAST，但EAST係屬於Direction class
  SOUTH('S',180), //
  WEST('W',270), //
  NORTH('N',360),
  ;
  private char direction;
  private int degree;

  private Direction(char direction, int degree){ //constructor
    
    this.direction=direction;
    this.degree =degree;
  }
  public  char getDirection(){
    return this.direction;
  }
  public int getDegreee(){
    return this.degree;
  }
  // public void setDirection(char direction){ <唔建議寫setter 只是logic上可行
  //   this.direction =direction; <唔理想
  // }

  public boolean isOppsite(Direction direction){
    return Math.abs(this.degree - direction.getDegreee())==180;
  // this.degree就係邊個object 的degree - user輸入方向.getDegreee method
  }
public static void main(String[] args) {
  System.out.println(Direction.EAST.getDirection());
  System.out.println(Direction.EAST.isOppsite(Direction.WEST)); // true
  System.out.println(Direction.WEST.isOppsite(Direction.EAST)); // true
  System.out.println(Direction.WEST.isOppsite(Direction.NORTH)); // false
 //System.out.println(Currency.HKD);


}
}
