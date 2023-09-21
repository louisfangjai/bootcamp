import java.util.Comparator;

public class Ball implements Comparable <Ball>{ //   line 153，compare要履行
    // implements
  int id;
  Color color;

  public Ball(int id,Color color){
    this.id=id;
    this.color = color;
  }
  // Yellow come first, if color same, id ascending order
  // if not Yellow, id descending order
  @Override
  public int compareTo(Ball ball){ // 一定存在因為有人會call你
    return ball.id > this.id ? 1 : -1;
    // 1 -> means you want put ball to left
    // -1 -> means you want put this to left
    // return ball.color == Color.YELLOW ? 1 :-1;
  }

  @Override
  public String toString(){
    return "[id= "+ this.id //
    + ", color = "+ this.color//
    + "]";
  }
}
